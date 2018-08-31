package mainPackage.controller.menu;

import mainPackage.controller.PaymentScheduleManagement;
import mainPackage.controller.input.Input;
import mainPackage.model.Address;
import mainPackage.model.PaymentSchedule;
import mainPackage.model.employeePackage.CommissionedEmployee;
import mainPackage.model.employeePackage.Employee;
import mainPackage.view.GeneralDefaultMessages;
import mainPackage.view.MenuMessages;
import mainPackage.view.PersonMessages;



public class ChangeDetailsMenu {
    private Input newInput = new Input();
    private GeneralDefaultMessages display2 = new GeneralDefaultMessages();

    private void option1(Employee employee){
        PersonMessages employeeDisplay = new PersonMessages();

        GeneralDefaultMessages.showMessage(employeeDisplay.nameMsg());
        employee.setName(newInput.simpleStringInput());

        GeneralDefaultMessages.showMessage(display2.successfulOperation());

    }

    private void option2(Employee employee){
        employee.setAddress( new Address());

        GeneralDefaultMessages.showMessage(display2.successfulOperation());
    }

    private void option3(Employee employee, PaymentScheduleManagement employeeDataStructure){
        MenuMessages display = new MenuMessages();

        GeneralDefaultMessages.showMessage(display.setEmployeeTypeMsg());
        int newEmployeeType = newInput.numberedInput(3);

        if (newEmployeeType != 3){
            employee.setEmployeeType(newEmployeeType);

//Because commissioned employees are set in a different class, we need to manage them differently
        }else {
            CommissionedEmployee newTypeEmployee = new CommissionedEmployee(newEmployeeType, employee);
            employeeDataStructure.removeEmployee(employee.getId());
            employeeDataStructure.addEmployee(newTypeEmployee);
        }
        GeneralDefaultMessages.showMessage(display2.successfulOperation());
    }

    public void changeDetailsMenu(PaymentScheduleManagement employeeDataStructure){
        MenuMessages display = new MenuMessages();
        int userOption;
        Employee employee;

        GeneralDefaultMessages.showMessage(display.changeDetailsMenu());
        userOption = newInput.numberedInput(8);


        if (userOption == 8){
            display2.endedOperation();
            return;
        }

        GeneralDefaultMessages.showMessage(display.informEmployeesIdMsg());
        employee = employeeDataStructure.getEmployee(newInput.onlyDigitsStringInput());

        if (employee == null){
            GeneralDefaultMessages.showMessage(display2.employeeNotFound());
            GeneralDefaultMessages.showMessage(display2.canceledOperation());
            return;

        }

        switch (userOption){
            case 1:
                option1(employee); break;
            case 2:
                option2(employee); break;
            case 3:
                option3(employee, employeeDataStructure); break;

        }


    }
}
