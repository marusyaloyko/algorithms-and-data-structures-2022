package ru.mirea.practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(fact(x));
    }

    public static int fact(int x) {
        if (x > 1) {
            return x * fact(x - 1);
        } else {
            return 1;
        }
    }
}