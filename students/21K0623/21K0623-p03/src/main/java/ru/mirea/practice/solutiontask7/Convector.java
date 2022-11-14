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
                return NumberFormat.getCurrencyInstance(Locale.UK);
            case 2:
                return NumberFormat.getCurrencyInstance(Locale.CANADA);
            case 3:
                return NumberFormat.getCurrencyInstance(Locale.US);
            case 4:
                return NumberFormat.getCurrencyInstance(Locale.FRANCE);
            case 5:
                return NumberFormat.getCurrencyInstance(Locale.CHINA);
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Какая у вас валюта: \n 1-£, 2-C$, 3-$, 4-€, 5-¥");
            int current = sc.nextInt();
            while (1 > current || current > 5) {
                System.out.println("Какая у вас валюта: \n 1-£, 2-C$, 3-$, 4-€, 5-¥");
                current = sc.nextInt();
            }
            System.out.println("Какую сумму вы желаете перевести:");
            double money = sc.nextDouble();
            while (money < 0.0) {
                System.out.println("Маленькая сумма, введите снова:");
                money = sc.nextDouble();
            }
            System.out.println("В какую предпочитаете перевести: \n 1-£, 2-C$, 3-$, 4-€, 5-¥");
            int toconvert = sc.nextInt();
            while (1 > toconvert || toconvert > 5) {
                System.out.println("Какая у вас валюта: \n 1-£, 2-C$, 3-$, 4-€, 5-¥");
                toconvert = sc.nextInt();
            }
            switch (current) {
                case 1:
                    money *= 1.18;
                    break;
                case 2:
                    money *= 0.72709;
                    break;
                case 4:
                    money *= 1.03;
                    break;
                case 5:
                    money *= 0.14026;
                    break;
                default:
                    break;
            }
            switch (toconvert) {
                case 1:
                    money *= 0.84631;
                    break;
                case 2:
                    money *= 1.38;
                    break;
                case 4:
                    money *= 0.96937;
                    break;
                case 5:
                    money *= 7.13;
                    break;
                default:
                    break;
            }
            System.out.println("Итого:" + Objects.requireNonNull(returnLocale(toconvert)).format(money));
        }
    }
}
