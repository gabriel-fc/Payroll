package mainPackage.controller;

import mainPackage.controller.input.Input;
import mainPackage.model.PaymentSchedule;
import mainPackage.model.employeePackage.CommissionedEmployee;
import mainPackage.model.employeePackage.Employee;
import mainPackage.view.GeneralDefaultMessages;
import mainPackage.view.PaymentScheduleMessages;

import java.util.ArrayList;

public class PaymentScheduleManagement {
    //here we can deal with employees data

    private ArrayList<PaymentSchedule> PSArrayList = new ArrayList<>();

    public PaymentScheduleManagement(){
        this.PSArrayList.add(new PaymentSchedule(1));
        this.PSArrayList.add(new PaymentSchedule(2));
        this.PSArrayList.add(new PaymentSchedule(3));
    }


    //creates a new employee and puts it in default schedule
    public Employee createEmployee(int employeeType, PaymentScheduleManagement employeeDataStructure){
        Employee newEmployee;

        if (employeeType == 3){
            newEmployee = new CommissionedEmployee(employeeType, employeeDataStructure);
            this.PSArrayList.get(2).addEmployee(newEmployee);

        }else{
            newEmployee = new Employee(employeeType, employeeDataStructure);

            if (employeeType == 1){
                this.PSArrayList.get(0).addEmployee(newEmployee);

            }else{
                this.PSArrayList.get(1).addEmployee(newEmployee);
            }
        }
        return newEmployee;
    }

    public Employee getEmployee(String id) {
        Employee employee = null;
        for (int i = 0; i < this.PSArrayList.size(); i++) {
            employee = PSArrayList.get(i).getEmployee(id);
            if (employee != null) {
                break;
            }
        }
        return employee;
    }

    public void addEmployee(Employee employee){
        PSArrayList.get(employee.getEmployeeType() - 1).addEmployee(employee);
    }

    private PaymentSchedule getSchedule(String id){

        for (int i = 0; i < PSArrayList.size(); i++) {
            if(PSArrayList.get(i).getScheduleId().compareTo(id) == 0){
                return PSArrayList.get(i);
            }
        }
        return null;
    }


    public void changeEmployeeSchedule(String id){
        PaymentScheduleMessages display = new PaymentScheduleMessages();
        GeneralDefaultMessages display2 = new GeneralDefaultMessages();
        Input newInput = new Input();
        int newScheduleIndex;
        PaymentSchedule newSchedule, oldSchedule;

        Employee employee = this.getEmployee(id);
        if (employee == null){
            GeneralDefaultMessages.showMessage(display2.employeeNotFound());
            GeneralDefaultMessages.showMessage(display2.canceledOperation());
            return;
        }

        GeneralDefaultMessages.showMessage(display.setPaymentScheduleMsg(PSArrayList));
        newScheduleIndex = newInput.numberedInput(this.PSArrayList.size()) - 1;

        oldSchedule = this.getSchedule(employee.getPaymentinfo().getScheduleId());
        newSchedule = PSArrayList.get(newScheduleIndex);

        if(oldSchedule.removeEmployee(employee.getId()) == null){
            GeneralDefaultMessages.showMessage(display2.errorMessage());
            return;
        }
        newSchedule.addEmployee(employee);

        GeneralDefaultMessages.showMessage(display2.successfulOperation());


    }

    public Employee removeEmployee(String id){
        PaymentSchedule currentPaymentSchedule;
        Employee employee;

        for (int i = 0; i < this.PSArrayList.size(); i++) {
           currentPaymentSchedule = this.PSArrayList.get(i);
           employee = currentPaymentSchedule.removeEmployee(id);

           if (employee != null){
                return employee;
            }

        }

        return null;
    }

}
