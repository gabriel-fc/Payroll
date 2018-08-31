package  mainPackage.model;

import mainPackage.controller.input.Input;
import  mainPackage.view.GeneralDefaultMessages;
import mainPackage.view.PersonMessages;

/**
 * Created by alunoic on 24/08/18.
 */
public class Address {
    private int number;
    private String street;
    private String district;
    private String complement;

    public Address(){
        PersonMessages display = new PersonMessages();
        Input newInput = new Input();

        GeneralDefaultMessages.showMessage(display.addressMsg());

        GeneralDefaultMessages.showMessage(display.streetMsg());
        this.street = newInput.simpleStringInput();

        GeneralDefaultMessages.showMessage(display.numberMsg());
        this.number = newInput.integerInput();

        GeneralDefaultMessages.showMessage(display.districtMsg());
        this.district = newInput.simpleStringInput();

        GeneralDefaultMessages.showMessage(display.complementMsg());
        this.complement = newInput.simpleStringInput();

    }

    public int getNumber() {
        return number;
    }

    public String getComplement() {
        return complement;
    }

    public String getDistrict() {
        return district;
    }

    public String getStreet() {
        return street;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        PersonMessages display = new PersonMessages();

        return display.addressMsg() + "\n  " +
                display.streetMsg() + this.street + ", " +
                display.numberMsg() + this.number + ", " +
                display.districtMsg() + this.district + ", " +
                display.complementMsg() + this.complement + ".\n";

    }
}
