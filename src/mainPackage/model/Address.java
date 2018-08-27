package  mainPackage.model;

import  mainPackage.controller.Input;
import  mainPackage.view.AddressMessages;
import  mainPackage.view.GeneralDefaultMessages;

/**
 * Created by alunoic on 24/08/18.
 */
public class Address {
    private String number;
    private String street;
    private String district;
    private String complement;

    public Address(){
        AddressMessages display = new AddressMessages();
        Input newInput = new Input();

        GeneralDefaultMessages.showMessage(display.streetMsg());
        this.street = newInput.simpleString();
        GeneralDefaultMessages.showMessage(display.numberMsg());
        this.number = newInput.simpleString();
        GeneralDefaultMessages.showMessage(display.districtMsg());
        this.district = newInput.simpleString();
        GeneralDefaultMessages.showMessage(display.complementMsg());
        this.complement = newInput.simpleString();

    }

    public String getNumber() {
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

    public void setNumber(String number) {
        AddressMessages display = new AddressMessages();

        GeneralDefaultMessages.showMessage(display.numberMsg());
        this.number = number;
    }

    public void setComplement(String complement) {
        AddressMessages display = new AddressMessages();

        GeneralDefaultMessages.showMessage(display.complementMsg());
        this.complement = complement;
    }

    public void setDistrict(String district) {
        AddressMessages display = new AddressMessages();

        GeneralDefaultMessages.showMessage(display.districtMsg);
        this.district = district;
    }

    public void setStreet(String street) {
        AddressMessages display = new AddressMessages();

        GeneralDefaultMessages.showMessage(display.streetMsg);
        this.street = street;
    }

    @Override
    public String toString() {
        return /*number +
        complement +
        street +
        district*/;
    }
}
