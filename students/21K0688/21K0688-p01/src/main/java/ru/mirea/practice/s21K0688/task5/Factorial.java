package ru.mirea.practice.s21K0688.task5;

public class Factorial {
    public static int factor(int a) {
        int sum = 1;
        for (int i = 1; i <= a; i++) {
            sum *= i;
        }
        return sum;
    }
}
