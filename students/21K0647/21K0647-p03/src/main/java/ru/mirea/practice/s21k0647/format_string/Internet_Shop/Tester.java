package ru.mirea.practice.s21k0647.format_string.Internet_Shop;


import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner source = new Scanner(System.in);
        ArrayList<Product> c = new ArrayList<>();
        Product a1 = new Product("Product1", 123);
        c.add(a1);
        Product a2 = new Product("Product2", 56);
        c.add(a2);
        Product a3 = new Product("Product3", 1000);
        c.add(a3);
        Product a4 = new Product("Product4", 532);
        c.add(a4);
        Product a5 = new Product("Product5", 976);
        c.add(a5);

        for (Product x: c) {
            System.out.println(x.Name + "\t" + x.price);
        }


        System.out.println("Add product to cart?");
        String s = source.nextLine();
        ArrayList<Product> basket = new ArrayList<>();
        float sum_basket = 0;
        while (s.equals("yes")) {
            String s1 = source.next();
            for (Product x: c) {
                if (s1.equals(x.Name)) {
                    basket.add(x);
                    sum_basket += x.price;
                }
            }
            System.out.println("Add product to cart?");
            s = source.next();
        }

        Locale.setDefault(new Locale("ru", "RU"));
        NumberFormat Format = NumberFormat.getCurrencyInstance();
        System.out.println("Amount in rubles: " + Format.format(sum_basket));
        System.out.println("Convert to another currency?");
        String conv = source.next();
        if (conv.equals("yes")) {
            System.out.print("Enter the currency language code: ");
            String kod_lang = source.next();
            System.out.print("Enter the country code of the currency: ");
            String kod_land = source.next();
            System.out.print("Enter the course");
            double course = source.nextDouble();
            System.out.println(converter(kod_lang, kod_land, course, sum_basket));
        }
    }

    public static String converter(String kod_lang, String kod_land, Double course, float sum_basket){
        Locale sumFormat2 = new Locale(kod_lang, kod_land);
        NumberFormat sumFormat_2 = NumberFormat.getCurrencyInstance(sumFormat2);
        return ("Amount in " + sumFormat2.getISO3Country() + " " + sumFormat_2.format(course * sum_basket));

    }

}
