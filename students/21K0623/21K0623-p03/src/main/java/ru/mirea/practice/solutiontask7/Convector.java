package ru.mirea.practice.solutiontask7;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public final class Convector {
    private Convector() {}

    public static NumberFormat returnLocale(int toconvert) {
        switch (toconvert) {
            case 1:
                return NumberFormat.getCurrencyInstance(Locale.US);
            case 2:
                return NumberFormat.getCurrencyInstance(Locale.CHINA);
            case 3:
                return NumberFormat.getCurrencyInstance(Locale.FRANCE);
            case 4:
                return NumberFormat.getCurrencyInstance(Locale.UK);
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Какая у вас валюта: \n 1-$, 2-¥, 3-€, 4-£");
            int current = sc.nextInt();
            while (1 > current || current > 5) {
                System.out.println("Какая у вас валюта: \n 1-$, 2-¥, 3-€, 4-£");
                current = sc.nextInt();
            }
            System.out.println("Какую сумму вы желаете перевести:");
            double money = sc.nextDouble();
            while (money < 0.0) {
                System.out.println("Маленькая сумма, введите снова:");
                money = sc.nextDouble();
            }
            System.out.println("В какую предпочитаете перевести: \n 1-$, 2-¥, 3-€, 4-£");
            int toconvert = sc.nextInt();
            while (1 > toconvert || toconvert > 5) {
                System.out.println("В какую предпочитаете перевести: \n 1-$, 2-¥, 3-€, 4-£");
                toconvert = sc.nextInt();
            }
            switch (current) {
                case 2:
                    money *= 0.14026;
                    break;
                case 3:
                    money *= 1.03;
                    break;
                case 4:
                    money *= 1.18;
                    break;
                default:
                    break;
            }
            switch (toconvert) {
                case 2:
                    money *= 7.13;
                    break;
                case 3:
                    money *= 0.96937;
                    break;
                case 4:
                    money *= 0.84631;
                    break;
                default:
                    break;
            }
            System.out.println("Итого:" + Objects.requireNonNull(returnLocale(toconvert)).format(money));
        }
    }
}
