package mainPackage.controller.menu;

import mainPackage.controller.PaymentScheduleManagement;
import mainPackage.controller.input.Input;
import mainPackage.model.employeePackage.CommissionedEmployee;
import mainPackage.model.employeePackage.Employee;
import mainPackage.view.GeneralDefaultMessages;
import mainPackage.view.MenuMessages;

public class ThrowSalesResult {

    protected void throwSalesResult(PaymentScheduleManagement employeeDataStructure){
        MenuMessages display = new MenuMessages();
        GeneralDefaultMessages display2 = new GeneralDefaultMessages();
        Employee employee;
        Input newInput = new Input();
        String id;

        GeneralDefaultMessages.showMessage(display.informEmployeesIdMsg());
        id = newInput.onlyDigitsStringInput();

        employee = employeeDataStructure.getEmployee(id);

        if (employee == null){
            GeneralDefaultMessages.showMessage(display2.employeeNotFound());
            GeneralDefaultMessages.showMessage(display2.canceledOperation());
            return;
        }
        if (employee.getEmployeeType() != 3){
            GeneralDefaultMessages.showMessage(display.notCommissionedEmployee());
            GeneralDefaultMessages.showMessage(display2.canceledOperation());
            return;
        }

        GeneralDefaultMessages.showMessage(display.setEmployeeSalesMsg());
        ((CommissionedEmployee) employee).setSales(newInput.floatInput());

        GeneralDefaultMessages.showMessage(display2.successfulOperation());


    }
}
