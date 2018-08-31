package mainPackage.controller;

import mainPackage.model.employeePackage.Employee;

import java.util.Random;
import java.lang.Math;

public class IdGenerator {
    //here we can generate a random and unique employeeId


    public String getId(PaymentScheduleManagement employeeDataStructure){
        String newId;
        Employee repeatCheck;
        int aux;
        Random random = new Random(System.currentTimeMillis());

        do {
            aux = 0;
            for (int i = 6; i > 0 ; --i) {
                aux += ((random.nextInt(10)) * Math.pow(10, i));
            }
            newId = Integer.toString(aux);
            repeatCheck = employeeDataStructure.getEmployee(newId);
        }while (repeatCheck != null);

        return newId;
    }
}
