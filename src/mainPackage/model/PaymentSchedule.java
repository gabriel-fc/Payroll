package mainPackage.model;

import mainPackage.controller.DateManagement;
import mainPackage.controller.input.Input;
import mainPackage.model.employeePackage.Employee;
import mainPackage.view.GeneralDefaultMessages;
import mainPackage.view.PaymentScheduleMessages;

import java.util.ArrayList;
import java.util.Calendar;

public class PaymentSchedule {
    private ArrayList<Employee> employeeDataStructure = new ArrayList<>();
    private String scheduleId;
    private Calendar nextPaymentDay;


    public PaymentSchedule(int employeeType) {
        DateManagement date = new DateManagement();
        PaymentScheduleMessages defaultScheduleId = new PaymentScheduleMessages();

        this.scheduleId = defaultScheduleId.setDefaultScheduleId(employeeType);

        if (employeeType == 1) {
            this.nextPaymentDay = date.getLastWorkDay(date.getLastDayOfMonth());

        } else if (employeeType == 2) {
            this.nextPaymentDay = date.getNextWeekDay(date.getCurrentDate(), 6);

        } else if (employeeType == 3) {
            this.nextPaymentDay = date.getNextWeekDay(date.getNextWeekDay(date.getCurrentDate(), 6), 6);
        }


    }

    public PaymentSchedule() {
        PaymentScheduleMessages display = new PaymentScheduleMessages();
        Input newInput = new Input();
        DateManagement currentDate = new DateManagement();

        GeneralDefaultMessages.showMessage(display.scheduleIdMsg());
        this.scheduleId = newInput.paymentScheduleInput();

        this.nextPaymentDay = currentDate.getCurrentDate();

    }



    public Employee getEmployee(String id){
        Employee employee;
        for (int i = 0; i < employeeDataStructure.size(); i++) {
            employee = employeeDataStructure.get(i);

            if (employee.getId().compareTo(id) == 0){
                return employee;
            }
        }
        return null;
    }

    public String getScheduleId() {
        return scheduleId;
    }


    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public void setNextPaymentDay(Calendar nextPaymentDay) {
        this.nextPaymentDay = nextPaymentDay;
    }

    public void addEmployee(Employee employee){
        this.employeeDataStructure.add(employee);
    }




    public Employee removeEmployee(String id){
        Employee employee;

        for (int i = 0; i < employeeDataStructure.size(); i++) {
            employee = employeeDataStructure.get(i);
            if (employee.getId().compareTo(id) == 0){
                employeeDataStructure.remove(i);
                return employee;
            }
        }
        return null;
    }
}
