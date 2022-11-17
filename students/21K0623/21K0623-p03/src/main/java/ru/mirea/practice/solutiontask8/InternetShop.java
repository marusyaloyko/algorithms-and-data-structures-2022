package ru.mirea.practice.solutiontask8;

import java.util.Objects;
import java.util.Scanner;

import static ru.mirea.practice.solutiontask7.Convector.convectorMoney;
import static ru.mirea.practice.solutiontask7.Convector.returnLocale;

public final class InternetShop {
    private InternetShop() {}

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Product[] products = {new Product("Молоко", 0.5),
                                  new Product("Печенья", 0.75),
                                  new Product("Кофе", 1.5)};
            System.out.println("Выберите товар:");
            int currentproduct = 0;
            while (currentproduct < 1 || currentproduct > 3) {
                int i = 1;
                for (Product product: products) {
                    System.out.println(i + ". " + product.getName() + " - " + product.getCost() + "$");
                    i++;
                }
                currentproduct = sc.nextInt();
            }
            System.out.println("Введите кол-во продукта");
            int count = sc.nextInt();
            while (count < 1) {
                count = sc.nextInt();
            }
            System.out.println("Введите удобную для вас валюту:\n1-$, 2-¥, 3-€, 4-£");
            int currentvalue = sc.nextInt();
            while (currentvalue < 1 || currentvalue > 4) {
                currentvalue = sc.nextInt();
            }
            System.out.println("Итого:" + Objects.requireNonNull(returnLocale(currentvalue))
                    .format(convectorMoney(1, currentvalue,
                            products[currentproduct - 1].getCost()) * count));

        }
    }
}
