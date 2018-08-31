package mainPackage.controller.menu;

import mainPackage.controller.PaymentScheduleManagement;
import mainPackage.controller.input.Input;
import mainPackage.model.employeePackage.Employee;
import mainPackage.view.GeneralDefaultMessages;
import mainPackage.view.MenuMessages;

public class ThrowAdditionalFee {
    protected void throwAdditionalFee(PaymentScheduleManagement employeeDataStructure){
        MenuMessages display = new MenuMessages();
        GeneralDefaultMessages display2 = new GeneralDefaultMessages();
        Employee employee;
        Input newInput = new Input();
        String id;

        GeneralDefaultMessages.showMessage(display.employeesAdditionalFeeMsg());
        id = newInput.onlyDigitsStringInput();

        employee = employeeDataStructure.getEmployee(id);

        if (employee == null){
            GeneralDefaultMessages.showMessage(display2.employeeNotFound());
            GeneralDefaultMessages.showMessage(display2.canceledOperation());
            return;
        }
        if (employee.getSyndicateInfo() == null){
            GeneralDefaultMessages.showMessage(display.notSyndicalizedEmployeeMsg());
            GeneralDefaultMessages.showMessage(display2.canceledOperation());
            return;
        }

        GeneralDefaultMessages.showMessage(display.setEmployeeAdditionalFeeMsg());
        employee.getSyndicateInfo().addAdditionalFee(newInput.floatInput());

        GeneralDefaultMessages.showMessage(display2.successfulOperation());


    }
}

