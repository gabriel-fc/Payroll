package mainPackage.controller.menu;

import mainPackage.controller.PaymentScheduleManagement;
import mainPackage.controller.input.Input;
import mainPackage.model.PaymentSchedule;
import mainPackage.model.employeePackage.Employee;
import mainPackage.view.GeneralDefaultMessages;
import mainPackage.view.MenuMessages;

public class EmployeeRemoval {

    protected void employeeRemoval(PaymentScheduleManagement employeeDataStructure){
        MenuMessages display = new MenuMessages();
        GeneralDefaultMessages display2 = new GeneralDefaultMessages();
        Input newInput = new Input();
        Employee employee;
        String id;

        GeneralDefaultMessages.showMessage(display.employeeToRemoveMsg());
        id = newInput.onlyDigitsStringInput();

        employee = employeeDataStructure.removeEmployee(id);

        if (employee == null){
            GeneralDefaultMessages.showMessage(display2.employeeNotFound());
            GeneralDefaultMessages.showMessage(display2.canceledOperation());
            return;
        }

        GeneralDefaultMessages.showMessage(display2.successfulOperation());

    }
}
