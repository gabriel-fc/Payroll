package mainPackage.view;


/**
 * Created by alunoic on 24/08/18.
 */
public class EmployeeMessages {
    //all messages, shown to the user, about salaried employees


    //Employee methods
    public String toStringEmployeeType(int employeeType){
        switch (employeeType){
            case 1:
                return "Assalariado";
            case 2:
                return "Horista";
            case 3:
                return "Comissionado";
            default:
                return null;
        }
    }

    public String salaryMsg(int employeeType){
        if (employeeType ==  2) {
            return "\nSalário por hora: ";
        }
        return "\nSalário: ";
    }

    public String setPaymentTypeMsg(){
        return "\nSelecione uma opção de pagamento.\n  " +
                "1. Cheque pelos correios.\n  " +
                "2. Chegue em mãos.\n  " +
                "3. Depósito em conta\n";

    }

    public String employeeTypeMsg(){
        return "Categoria do funcionário: ";
    }

    public String employeeIdMsg(String employeeId){
        return "\nIdentificação do usuário: " +
                employeeId + "\n";
    }


    //Comissioned employee methods
    public String commissionMsg(){
        return "\nComissão: ";
    }

    public String salesMsg(){
        return "\nVendas: ";
    }



    //Syndicate methods
    public String syndicalIdMsg(){
        return "\nIdentificação sindical: ";
    }

    public String syndicalTaxMsg(){
        return "\nImposto sindical: ";
    }

    public String additionalFeeMsg(){
        return "\nTaxa adicional: ";
    }

}
