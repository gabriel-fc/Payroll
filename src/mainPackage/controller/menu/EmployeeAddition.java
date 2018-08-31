package mainPackage.controller.menu;

import mainPackage.controller.PaymentScheduleManagement;
import mainPackage.controller.input.Input;
import mainPackage.model.employeePackage.Employee;
import mainPackage.view.GeneralDefaultMessages;
import mainPackage.view.MenuMessages;

public class EmployeeAddition {

    protected void  employeeAddition(PaymentScheduleManagement employeeDataStructure){
        MenuMessages display = new MenuMessages();
        GeneralDefaultMessages display2 = new GeneralDefaultMessages();
        Employee employee;
        int employeeType;
        Input newInput = new Input();

        GeneralDefaultMessages.showMessage(display.setEmployeeInfo());

        GeneralDefaultMessages.showMessage(display.setEmployeeTypeMsg());
        employeeType = newInput.numberedInput(3);

        employee = employeeDataStructure.createEmployee(employeeType, employeeDataStructure);

        GeneralDefaultMessages.showMessage(display.newEmployeeIdMsg(employee.getId()));
        GeneralDefaultMessages.showMessage(display2.successfulOperation());

    }

}
