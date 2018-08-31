package mainPackage.model.employeePackage.employeeAdditionalInfo;

import mainPackage.controller.input.Input;
import mainPackage.view.EmployeeMessages;
import mainPackage.view.GeneralDefaultMessages;
import mainPackage.view.PaymentScheduleMessages;

import java.util.Calendar;

public class PaymentInfo {
    private float salary;
    private int paymentType;
    private Calendar paymentDay;
    private String scheduleId;

    public PaymentInfo(int employeeType){
        Input newInput = new Input();
        EmployeeMessages display = new EmployeeMessages();
        PaymentScheduleMessages scheduleId = new PaymentScheduleMessages();

        GeneralDefaultMessages.showMessage(display.salaryMsg(employeeType));
        this.salary = newInput.floatInput();

        GeneralDefaultMessages.showMessage(display.setPaymentTypeMsg());
        this.paymentType = newInput.numberedInput(3);

        this.scheduleId = scheduleId.setDefaultScheduleId(employeeType);
        
    }

    public float getSalary() {
        return salary;
    }

    public int getPaymentType() {
        return paymentType;
    }

    public Calendar getPaymentDay() {
        return paymentDay;
    }

    public String getScheduleId() {
        return scheduleId;
    }


    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setPaymentType(int paymentType) {
        this.paymentType = paymentType;
    }

    public void setPaymentDay(Calendar paymentDay) {
        this.paymentDay = paymentDay;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }
}
