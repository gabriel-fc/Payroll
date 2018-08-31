package mainPackage.model.employeePackage.employeeAdditionalInfo;

import mainPackage.controller.DateManagement;
import mainPackage.controller.input.Input;
import mainPackage.view.GeneralDefaultMessages;
import mainPackage.view.EmployeeMessages;

import java.util.Calendar;

public class SyndicateInfo {

    private String syndicalId;
    private float syndicalTax;
    private float additionalFee;
    private Calendar paymentExpirationDate;


    public SyndicateInfo(String employeeId) {
        Input newInput = new Input();
        EmployeeMessages display = new EmployeeMessages();
        DateManagement currentDate = new DateManagement();

        GeneralDefaultMessages.showMessage(display.syndicalIdMsg());
        this.syndicalId = newInput.simpleStringInput();

        GeneralDefaultMessages.showMessage(display.syndicalTaxMsg());
        this.syndicalTax = newInput.floatInput();

        GeneralDefaultMessages.showMessage(display.additionalFeeMsg());
        this.additionalFee = newInput.floatInput();

        this.paymentExpirationDate = currentDate.getCurrentDate();
        this.paymentExpirationDate.add(Calendar.DAY_OF_MONTH, 30);

    }



    public String getSyndicalId() {
        return syndicalId;
    }

    public float getSyndicalTax() {
        return syndicalTax;
    }

    public float getAdditionalFee() {
        return additionalFee;
    }

    public Calendar getPaymentExpirationDate() {
        return paymentExpirationDate;
    }


    public void setSyndicalTax(float syndicalTax) {
        this.syndicalTax = syndicalTax;
    }

    public void setAdditionalFee(float additionalFee) {
        this.additionalFee = additionalFee;
    }

    public void addAdditionalFee(Float additionalFee){
        this.additionalFee += additionalFee;
    }

    public void setPaymentExpirationDate(Calendar paymentExpirationDate) {
        this.paymentExpirationDate = paymentExpirationDate;
    }


    @Override
    public String toString() {
        EmployeeMessages display = new EmployeeMessages();

        return "Informações sindicais:\n  " + display.syndicalIdMsg() +
                this.syndicalId + "\n  " + display.syndicalTaxMsg() +
                this.syndicalTax + "\n  " + display.additionalFeeMsg() +
                this.additionalFee + "\n";
    }
}


