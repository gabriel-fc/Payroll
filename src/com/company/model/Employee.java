package com.company.model;

import com.company.controller.Input;
import com.company.view.EmployeeMessages;
import com.company.view.GeneralDefaultMessages;

/**
 * Created by alunoic on 24/08/18.
 */
public class Employee {
    private String name;
    private Address address;

    public Employee(){
        Input newInput = new Input();
        EmployeeMessages display = new EmployeeMessages();

        GeneralDefaultMessages.showMessage(display.nameMsg());
        this.name = newInput.simpleString();
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
}

