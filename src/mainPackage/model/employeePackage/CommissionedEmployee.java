package mainPackage.model.employeePackage;

import mainPackage.controller.PaymentScheduleManagement;
import mainPackage.controller.input.Input;
import mainPackage.view.EmployeeMessages;
import  mainPackage.view.GeneralDefaultMessages;

public class CommissionedEmployee extends Employee{
    private float commission;
    private float sales;

    public CommissionedEmployee(int employeeType, Employee employee){
        super(employeeType, employee);

        this.commission = 0;
        this.sales = 0;
    }

    public CommissionedEmployee(int employeeType, PaymentScheduleManagement employeeDataStructure){
        super(employeeType, employeeDataStructure);
        EmployeeMessages display = new EmployeeMessages();
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

   /* @Override
    public String toString() {
        return super.toString() +  sales and commission;
    }*/

}
