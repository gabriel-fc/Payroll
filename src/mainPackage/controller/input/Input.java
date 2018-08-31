package mainPackage.controller.input;

/**
 * Created by alunoic on 24/08/18.
 */

import mainPackage.view.GeneralDefaultMessages;

import mainPackage.controller.DateManagement;
import java.util.Scanner;


public class Input {
    //here we deal with all exceptions

    private Scanner input = new Scanner(System.in);
    private GeneralDefaultMessages display = new GeneralDefaultMessages();

    public String simpleStringInput(){
       return input.nextLine();
    }

    public float  floatInput(){
        float variable = -1;
        boolean correctInput = false;

        while(!correctInput){
            try{
                variable = Float.parseFloat(this.input.nextLine());
                correctInput = true;
            }catch (NumberFormatException exception){
                GeneralDefaultMessages.showMessage(display.invalidInput());
            }
        }
        return variable;
    }

    // this method is used for string inputs composed only by integer numbers
    public String onlyDigitsStringInput(){
        String variable = input.nextLine();
        for (int i = 0; i < variable.length(); i++) {
            if (!(Character.isDigit(variable.charAt(i)))) {
                GeneralDefaultMessages.showMessage(display.invalidInput());
                variable = this.input.nextLine();
                i = -1;
            }
        }
        return variable;
    }

    //Receives the number of valid inputs and returns a valid input
    public int numberedInput(int numbOfOptions){
        int variable = -1;
        boolean correctInput = false;
        while (!correctInput){
            try {
                variable = Integer.parseInt(this.input.nextLine());
                if (variable >=1 && variable<=numbOfOptions){
                    correctInput = true;
                }
                else{
                    GeneralDefaultMessages.showMessage(display.invalidOption());
                }
            }
            catch (NumberFormatException exception){
                GeneralDefaultMessages.showMessage(display.invalidInput());
            }
        }
        return variable;
    }


    public String paymentScheduleInput() {
        DateManagement weekDay = new DateManagement();
        String id = input.nextLine();
        boolean validInput = false;

        while(!validInput) {
            if (id.contains("mensal")) {

                if (id.length() == 8 || id.length() == 9) {

                    if (id.charAt(6) == ' ') {

                        if ( id.length() == 8 &&Character.isDigit(id.charAt(7)) || id.charAt(7) == '$') {

                            validInput = true;

                        }else if (Character.isDigit(id.charAt(7)) && Character.isDigit(id.charAt(8))){

                            validInput = true;
                        }
                    }
                }

            }else if (id.contains("semanal")){
                if (id.charAt(7) == ' ' && id.charAt(9) == ' '){

                    if (Character.isDigit(id.charAt(8))){
                        int workDay = weekDay.workDayByString(id);

                        if (workDay != 0){

                            if (workDay == 1 && id.length() == 17){

                                validInput = true;

                            }else if ((workDay == 2 || workDay == 5) && id.length() == 15){

                                validInput = true;

                            }else if ((workDay == 3 || workDay == 4) && id.length() == 16){

                                validInput = true;
                            }
                        }
                    }
                }

            }

            if (!validInput){
                GeneralDefaultMessages.showMessage(display.wrongFormatInput());
                id = input.nextLine();
            }
        }
        return id;
    }


    public int integerInput(){
        boolean correctInput = false;
        int variable = -1;
        while (!correctInput){
            try {
                variable = Integer.parseInt(this.input.nextLine());
                correctInput = true;
            } catch (NumberFormatException exception){
                GeneralDefaultMessages.showMessage(display.invalidInput());
            }
        }
        return variable;
    }
}
