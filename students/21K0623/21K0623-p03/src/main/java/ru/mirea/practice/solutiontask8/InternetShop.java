package ru.mirea.practice.solutiontask8;

import java.util.Objects;
import java.util.Scanner;

import static ru.mirea.practice.solutiontask7.Convector.returnLocale;

public final class InternetShop {
    private InternetShop() {}

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double[] milk = {0.5, 3.56, 0.48, 0.42};
            double[] cookies = {0.75, 5.35, 0.73, 0.63};
            double[] coffee = {1.5, 10.7, 1.45, 1.27};
            System.out.println("Выберите товар:\n1-Молоко (0.5$ - 3.56¥ - 0,48€ - 0,42£)"
                    + "\n2-Печенья (0.75$ - 5.35¥ - 0,73€ - 0.63£) "
                    + "\n3-Кофе (1.5$ - 10,7¥ - 1,45€ - 1,27£ ");
            int currentproduct = sc.nextInt();
            while (currentproduct < 1 || currentproduct > 3) {
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
            switch (currentproduct) {
                case 1:
                    System.out.println("Итого:" + Objects.requireNonNull(returnLocale(currentvalue))
                            .format(milk[currentvalue - 1] * count));
                    break;
                case 2:
                    System.out.println("Итого:" + Objects.requireNonNull(returnLocale(currentvalue))
                            .format(cookies[currentvalue - 1] * count));
                    break;
                case 3:
                    System.out.println("Итого:" + Objects.requireNonNull(returnLocale(currentvalue))
                            .format(coffee[currentvalue - 1] * count));
                    break;
                default:
                    break;
            }
        }
    }
}
