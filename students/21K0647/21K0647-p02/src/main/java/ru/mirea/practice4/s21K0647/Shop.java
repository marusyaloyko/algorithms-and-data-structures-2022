package ru.mirea.practice4.s21K0647;

import java.util.ArrayList;
public class Shop {
    ArrayList<Computer> C = new ArrayList<Computer>();

    public void addComputer(Computer a) {
        C.add(a);
    }


    public void deleteComputer(String model) {
        for (Computer x : C) {
            if(x.model.equals(model)){
                C.remove(x);
            }
        }
    }
    public String searchComputer(String model) {
        String n = "Not found";
        for (Computer x : C) {
            if (x.model.equals(model)) {
                n =  "Model: " + x.model + "\tProcessor: " + x.processor + "\tMemory: " + x.memory + "\tBattery: " + x.battery;
            }
        }
        return n;
    }
}


