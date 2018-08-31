package mainPackage.view;

import mainPackage.model.PaymentSchedule;

import java.util.ArrayList;

public class PaymentScheduleMessages {

    public String setPaymentScheduleMsg(ArrayList<PaymentSchedule> PSArrayList){
        String aux = "";
        for (int i = 0; i < PSArrayList.size(); i++) {
            aux += Integer.toString(i+1) + ". " + PSArrayList.get(i).getScheduleId() + "\n";
        }
        return aux;
    }

    //gets employee type and returns schedule default Id
    public String setDefaultScheduleId(int employeeType) {
        if (employeeType == 1) {
            return ("mensal $");

        } else if (employeeType == 2) {
            return ("semanal 1 sexta");
        }
        return ("semanal 2 sexta");
    }

    public String scheduleIdMsg(){
        return "Identificação da agenda: ";
    }


}
