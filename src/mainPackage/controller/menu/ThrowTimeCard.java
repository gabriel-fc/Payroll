package mainPackage.controller.menu;

import mainPackage.controller.PaymentScheduleManagement;
import mainPackage.controller.input.Input;
import mainPackage.model.employeePackage.Employee;
import mainPackage.view.GeneralDefaultMessages;
import mainPackage.view.MenuMessages;

public class ThrowTimeCard {

    protected void throwTimeCard(PaymentScheduleManagement employeeDataStructure){
        MenuMessages display = new MenuMessages();
        GeneralDefaultMessages display2 = new GeneralDefaultMessages();
        Employee newEmployee;
        Input newInput = new Input();
        String id;

        GeneralDefaultMessages.showMessage(display.employeesTimeCardMsg());
        id = newInput.onlyDigitsStringInput();

        newEmployee = employeeDataStructure.getEmployee(id);

        if (newEmployee == null){
            GeneralDefaultMessages.showMessage(display2.employeeNotFound());
            GeneralDefaultMessages.showMessage(display2.canceledOperation());
            return;
        }

        GeneralDefaultMessages.showMessage(display.setEmployeeHoursMsg());
        newEmployee.getTimeCard().setTimecard(newInput.floatInput());

        GeneralDefaultMessages.showMessage(display2.successfulOperation());


    }
}
