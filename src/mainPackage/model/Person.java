package mainPackage.model;

import mainPackage.controller.input.Input;
import  mainPackage.view.PersonMessages;
import  mainPackage.view.GeneralDefaultMessages;

public abstract class Person {
    private String name;
    private Address address;

    protected Person() {
        Input newInput = new Input();
        PersonMessages display = new PersonMessages();

        GeneralDefaultMessages.showMessage(display.nameMsg());
        this.name = newInput.simpleStringInput();

        address = new Address();

    }


    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }




    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    @Override
    public String toString() {
        PersonMessages display = new PersonMessages();

        return display.nameMsg() + "\n  " +
                this.name + "\n" + this.address.toString();
    }
}