package ru.mirea.practice.form.task1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

abstract class Convertor {

    public static void main(String[] args) {
        double dollar;
        double euro;
        double rub;
        System.out.print("1) Rub, 2) Dollar, 3) Euro\n");
        try (Scanner sc = new Scanner(System.in)) {
            int choice;
            choice = sc.nextInt();
            double number;
            System.out.print("Enter the value: ");
            Locale ru = new Locale("ru", "RU");
            number = sc.nextDouble();
            switch (choice) {
                case 1:
                    NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
                    dollar = number / 61.31;
                    System.out.println(us.format(dollar));
                    NumberFormat eu = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                    euro = number / 63.46;
                    System.out.println(eu.format(euro));
                    break;
                case 2:
                    NumberFormat eu2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                    euro = number * 0.97;
                    System.out.println(eu2.format(euro));
                    NumberFormat rus = NumberFormat.getCurrencyInstance(ru);
                    rub = number * 61.61;
                    System.out.println(rus.format(rub));
                    break;
                case 3:
                    NumberFormat us2 = NumberFormat.getCurrencyInstance(Locale.US);
                    dollar = number * 1.04;
                    System.out.println(us2.format(dollar));
                    NumberFormat rus2 = NumberFormat.getCurrencyInstance(ru);
                    rub = number * 63.46;
                    System.out.println(rus2.format(rub));
                    break;
                default:
                    System.out.println("invalid value");
                    break;
            }
        }
    }
}

