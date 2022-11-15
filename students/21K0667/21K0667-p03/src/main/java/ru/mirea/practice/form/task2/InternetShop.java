package ru.mirea.practice.form.task2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

abstract class InternetShop {
    public static void main(String[] args) {
        double bread = 0.5;
        double milk = 1.5;
        double cheese = 2;

        System.out.println("What currency do you want to pay with: ");
        System.out.println("1: Rub, 2: Dollar, 3: Euro");
        try (Scanner scanner = new Scanner(System.in)) {
            int choiceOfCurrency = scanner.nextInt();

            switch (choiceOfCurrency) {
                case 1:
                    bread = 0.5 * 61.321;
                    milk = 1.5 * 61.321;
                    cheese = 2 * 61.321;
                    Locale ru = new Locale("ru", "RU");
                    NumberFormat format1 = NumberFormat.getCurrencyInstance(ru);
                    System.out.println(format1.format(bread) + " - bread");
                    System.out.println(format1.format(milk) + " - milk");
                    System.out.println(format1.format(cheese) + " - cheese");
                    break;
                case 2:
                    NumberFormat format2 = NumberFormat.getCurrencyInstance(Locale.US);
                    System.out.println(format2.format(bread) + " - bread");
                    System.out.println(format2.format(milk) + " - milk");
                    System.out.println(format2.format(cheese) + " - cheese");
                    break;
                case 3:
                    bread = bread * 0.97;
                    cheese = cheese * 0.97;
                    milk = milk * 0.97;
                    NumberFormat format3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                    System.out.println(format3.format(bread) + " - bread");
                    System.out.println(format3.format(milk) + " - milk");
                    System.out.println(format3.format(cheese) + " - cheese");
                    break;
                default:
                    System.out.println("Wrong");
                    break;
            }
        }
    }
}