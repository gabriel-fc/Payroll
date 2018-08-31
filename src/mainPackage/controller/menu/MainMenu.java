package mainPackage.controller.menu;

import mainPackage.controller.PaymentScheduleManagement;
import mainPackage.controller.input.Input;
import mainPackage.view.GeneralDefaultMessages;
import mainPackage.view.MenuMessages;

public class MainMenu {

    public void mainMenu(PaymentScheduleManagement employeeDataStructure){
        MenuMessages display = new MenuMessages();
        Input newInput = new Input();
        int userOption;

        GeneralDefaultMessages.showMessage(display.mainMenuMsg());
        userOption = newInput.numberedInput(11);



        if (userOption == 11){
            return;
        }

        if (userOption == 1){
            EmployeeAddition employeeAddition = new EmployeeAddition();
            employeeAddition.employeeAddition(employeeDataStructure);

        }else if (userOption == 2){
            EmployeeRemoval employeeRemoval = new EmployeeRemoval();
            employeeRemoval.employeeRemoval(employeeDataStructure);

        }else if (userOption == 3){
            ThrowTimeCard throwTimeCard = new ThrowTimeCard();
            throwTimeCard.throwTimeCard(employeeDataStructure);

        }else if (userOption == 4){
            ThrowSalesResult throwSalesResult = new ThrowSalesResult();
            throwSalesResult.throwSalesResult(employeeDataStructure);

        }else if (userOption == 5){
            ThrowAdditionalFee throwAdditionalFee = new ThrowAdditionalFee();
            throwAdditionalFee.throwAdditionalFee(employeeDataStructure);

        }else if (userOption == 6){
            ChangeDetailsMenu changeDetailsMenu = new ChangeDetailsMenu();
            changeDetailsMenu.changeDetailsMenu(employeeDataStructure);
        }

        mainMenu(employeeDataStructure);
    }
}
