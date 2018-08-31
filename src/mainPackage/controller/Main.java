package mainPackage.controller;

import mainPackage.controller.input.Input;
import mainPackage.controller.menu.EmployeeAddition;
import mainPackage.controller.menu.MainMenu;

public class Main {

    public static void main(String[] args) {
        Input newInput = new Input();
        PaymentScheduleManagement employeeDataStructure = new PaymentScheduleManagement();
        MainMenu menu = new MainMenu();
        menu.mainMenu(employeeDataStructure);


    }
}
