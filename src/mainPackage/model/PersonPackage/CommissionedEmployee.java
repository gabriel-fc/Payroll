package mainPackage.model.PersonPackage;

import  mainPackage.controller.Input;
import  mainPackage.view.CommissionedEmployeeMessages;
import  mainPackage.view.GeneralDefaultMessages;

public class CommissionedEmployee extends SalariedEmployee {
    private float commission;
    private float sales;

    public CommissionedEmployee(){
        super();
        CommissionedEmployeeMessages display = new CommissionedEmployeeMessages();
        Input newInput = new Input();

        GeneralDefaultMessages.showMessage(display.commissionMsg());
        this.commission = newInput.floatInput();

        GeneralDefaultMessages.showMessage(display.salesMsg());
        this.sales = newInput.floatInput();

    }

    public float getCommission() {
        return commission;
    }

    public float getSales() {
        return sales;
    }


    public void setCommission(float commission) {
        this.commission = commission;
    }

    public void setSales(float sales) {
        this.sales = sales;
    }

    @Override
    public String toString() {
        return super.toString() + /* sales and commission*/;
    }
}
