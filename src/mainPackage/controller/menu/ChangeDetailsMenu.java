package mainPackage.controller.menu;

import mainPackage.controller.input.Input;
import mainPackage.model.Address;
import mainPackage.model.PaymentSchedule;
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

    private void option3(Employee employee, PaymentSchedule employeeDataStructure){
        MenuMessages display = new MenuMessages();

        GeneralDefaultMessages.showMessage(display.setEmployeeInfo());

        GeneralDefaultMessages.showMessage(display.setEmployeeTypeMsg());
        int employeeType = newInput.numberedInput(3);

        if (employeeType != 3){
            employee.setEmployeeType(employeeType);

        }else {
            employeeDataStructure.
        }
    }

    public void changeDetailsMenu(PaymentSchedule employeeDataStructure){
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

        }


    }
}
