package  mainPackage.model.PersonPackage;

import  mainPackage.controller.*;
import  mainPackage.view.EmployeeMessages;
import  mainPackage.view.GeneralDefaultMessages;

/**
 * Created by alunoic on 24/08/18.
 */
public abstract class Employee extends Person {
    private int daysOfLastPayment;
    private int paymentType;
    private boolean syndicated;
    private String id;

    public Employee(){
        super();
        Input newInput = new Input();
        EmployeeMessages display = new EmployeeMessages();
        IdGenerator newId = new IdGenerator();

        // salario/hora-salario do funcionario
        GeneralDefaultMessages.showMessage(salaryMsg());
        this.salary = newInput.floatInput();

        GeneralDefaultMessages.showMessage(display.setPaymentTypeMsg());
        paymentType = (newInput.numberedInput(3));

        GeneralDefaultMessages.showMessage(display.setSyndicateMsg());
        this.syndicated = newInput.booleanInput();

        daysOfLastPayment = 0;
        id = newId.getId();

    }


    abstract float salary;


    public int getPaymentType() {
        return paymentType;
    }

    public boolean isSyndicated() {
        return syndicated;
    }

    public int getDaysOfLastPayment() {
        return daysOfLastPayment;
    }

    public String getId() {
        return id;
    }


    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setPaymentType(int paymentType) {
        this.paymentType = paymentType;
    }

    public void setisSyndicated(boolean syndicated) {
        this.syndicated = syndicated;
    }

    public void setDaysOfLastPayment(int daysOfLastPayment) {
        this.daysOfLastPayment = daysOfLastPayment;
    }


    @Override
    public String toString() {
        return super.toString() + /*salary +
        paymentType +
        isSyndicated*/;
    }
}

