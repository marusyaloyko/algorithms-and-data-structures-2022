package ru.mirea.practice.form.task2;


import java.util.Scanner;

abstract class InternetShop {
    public static void main(String[] args) {
        String language;
        String land;
        double course;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Write your language code: ");
            language = scanner.nextLine();
            System.out.println("Write your land code");
            land = scanner.nextLine();
            System.out.println("Exchange rate from dollar to your currency:");
            course = scanner.nextDouble();
        }
        double bread = 0.5;
        double milk = 1.5;
        double cheese = 2;
        System.out.println("bread: " + ConvertorShop.convert(language, land, course, bread));
        System.out.println("milk: " + ConvertorShop.convert(language, land, course, milk));
        System.out.println("cheese: " + ConvertorShop.convert(language, land, course, cheese));
    }
}