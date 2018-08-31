package  mainPackage.model.employeePackage;

import  mainPackage.controller.*;
import mainPackage.model.Person;
import mainPackage.model.employeePackage.employeeAdditionalInfo.PaymentInfo;
import mainPackage.model.employeePackage.employeeAdditionalInfo.SyndicateInfo;
import mainPackage.model.employeePackage.employeeAdditionalInfo.TimeCard;
import mainPackage.view.PersonMessages;

/**
 * Created by alunoic on 24/08/18.
 */
public class Employee extends Person {
    private int employeeType;
    private SyndicateInfo syndicateInfo;
    private String id;
    private PaymentInfo paymentinfo;
    private TimeCard timeCard;

    public Employee(int employeeType, Employee employee){
        this.employeeType = employeeType;
        this.syndicateInfo = employee.getSyndicateInfo();
        this.id = employee.getId();
        this.paymentinfo = employee.getPaymentinfo();
        this.timeCard = employee.getTimeCard();
    }

    public Employee(int employeeType, PaymentScheduleManagement employeeDataStructure){
        super();

        this.paymentinfo = new PaymentInfo(employeeType);

        IdGenerator newId = new IdGenerator();

        this.syndicateInfo = null;

        this.employeeType = employeeType;

        this.id = newId.getId(employeeDataStructure);


        this.timeCard = new TimeCard();
    }


    public SyndicateInfo getSyndicateInfo() {
        return syndicateInfo;
    }

    public int getEmployeeType() {
        return employeeType;
    }

    public String getId() {
        return id;
    }

    public PaymentInfo getPaymentinfo() {
        return paymentinfo;
    }

    public TimeCard getTimeCard() {
        return timeCard;
    }

    public void setSyndicateInfo(SyndicateInfo syndicateInfo) {
        this.syndicateInfo = syndicateInfo;
    }

    public void setEmployeeType(int employeeType) {
        this.employeeType = employeeType;
    }

    public void setTimeCard(TimeCard timeCard) {
        this.timeCard = timeCard;
    }

    /*@Override
    public String toString() {
        PersonMessages display = new PersonMessages();

        return super.toString() + "\n  " +
                display.toStringEmployeeType(this.employeeType)
    }*/
}

