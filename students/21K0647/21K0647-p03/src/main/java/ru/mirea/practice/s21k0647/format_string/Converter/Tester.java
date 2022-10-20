package ru.mirea.practice.s21k0647.format_string.Converter;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the number you want to translate ");
        System.out.println("converted from code land");
        System.out.println("In language code");
        System.out.println("In land code");
        System.out.println("Exchange rate from currency to currency");
        currency_converter app = new currency_converter(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine());
        app.Formated();
        System.out.print(app.toString());
    }
}
