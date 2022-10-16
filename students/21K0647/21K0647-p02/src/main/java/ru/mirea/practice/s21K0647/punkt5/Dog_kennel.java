package ru.mirea.practice.s21K0647.punkt5;

import java.util.Scanner;
import java.util.ArrayList;

public class Dog_kennel {
    public static void main(String[] args) {
        Scanner source = new Scanner(System.in);
        Dog a1 = new Dog("Jerry", 10);
        ArrayList<Dog> kennel = new ArrayList<Dog>();
        kennel.add(a1);
        Dog a2 = new Dog("Pat", 4);
        kennel.add(a2);
        System.out.println(kennel.get(1).ManAlt());
        for(Dog x: kennel){
            System.out.println(x.ToString());
        }
    }
}
