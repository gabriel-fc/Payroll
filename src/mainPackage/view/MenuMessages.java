package mainPackage.view;

public class MenuMessages {

    //mainMenuMessages
    public String mainMenuMsg() {
        return "\n\nEscolha uma das opções abaixo:\n  " +
                "1. Adicionar funcionário\n  " +
                "2. Remover funcionário\n  " +
                "3. Lançar cartão de ponto\n  " +
                "4. Lançar resultado de venda\n  " +
                "5. Lançar taxa de serviço\n  " +
                "6. Alterar detalhes de um empregado\n  " +
                "7. Rodar folha de pagamento\n  " +
                "8. Undo/Redu\n  " +
                "9. Agenda de pagamento\n  " +
                "10. Criar agenda de pagamento\n  " +
                "11. Sair\n";
    }


    //employee addition methods

    public String setEmployeeInfo() {
        return "Informe os dados do novo funcionário.\n\n";
    }

    public String setEmployeeTypeMsg() {
        return "Selecione uma categoria de funcionário.\n  " +
                "1. Assalariado.\n  " +
                "2. Horista.\n  " +
                "3. Comissionado.\n";
    }

    public String newEmployeeIdMsg(String id) {
        return "A nova identificação do usuário é: " + id + "\n";
    }

    //employee removal methods

    public String employeeToRemoveMsg() {
        return "Informe a Identificação do usuário a ser removido: ";
    }


//throw employee timecard methods

    public String employeesTimeCardMsg() {
        return "Informe a identificação referente ao funcionário dono do cartão de ponto: ";
    }

    public String setEmployeeHoursMsg() {
        return "Informe o número de horas trabalhadas: ";
    }


//throw employee sales results methods

    public String informEmployeesIdMsg() {
        return "Informe a identificação do funcionário: ";
    }

    public String notCommissionedEmployee() {
        return "Funcionário não comissionado!\n";
    }

    public String setEmployeeSalesMsg() {
        return "Informe o valor das vendas: ";
    }


//throw employee additional fee methods

    public String employeesAdditionalFeeMsg(){
        return "Informe a identificação do funcionário sindicalizado: ";
    }

    public String notSyndicalizedEmployeeMsg(){
        return "Funcionário não sindicalizado!\n";
    }

    public String setEmployeeAdditionalFeeMsg(){
        return "Informe o valor da taxa adicional: ";
    }

//change details methods
    public String changeDetailsMenu(){
        return "\n\nEscolha uma das opções abaixo para fazer alterações:\n  " +
                "1. Nome\n  "+
                "2. Endereço\n  " +
                "3. Tipo de funcionário\n  " +
                "4. Método de pagamento\n  " +
                "5. Sindicalização\n  " +
                "6. Identificação no sindicato\n  " +
                "7. Taxa sindical\n  " +
                "8. Sair\n";
    }

    public String getEmployeeIdMsg{
        return ""
    }



}