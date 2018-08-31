package mainPackage.view;


/**
 * Created by alunoic on 24/08/18.
 */
public class GeneralDefaultMessages {
    //all default messages, like successful operation messages and others

    public static void showMessage(String message){
        System.out.print(message);
    }

    public String invalidInput(){
        return "Entrada inválida! Por favor tente novamente.\n";
    }

    public String invalidOption(){
        return "Digite uma opção válida!\n";
    }

    public String wrongFormatInput(){
        return "Formato de entrada inválido! Por favor insira uma entrada que obedeça o template.\n";
    }

    public String successfulOperation(){
        return "Operação realizada com sucesso!\n";
    }

    public String employeeNotFound(){
        return "Funcionário não encontrado!\n\n";
    }

    public String canceledOperation(){
        return "Operação cancelada!\n";
    }

    public String errorMessage(){
        return "Um erro ocorreu durante a execução, contate um responsavel!\n";
    }

    public String endedOperation(){
        return "Operação finalizada!\n";
    }


}
