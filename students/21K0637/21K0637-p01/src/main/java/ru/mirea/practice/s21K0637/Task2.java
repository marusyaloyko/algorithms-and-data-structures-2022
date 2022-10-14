package ru.mirea.practice.s21K0637;

import java.util.Scanner;

public class Task2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("inter size of array");
        int n = sc.nextInt();
        int[] array = new int[n];
        int i = 0;
        int sum = 0;
        System.out.printf("Inter %d numbers\n", n);
        do {
            int a = sc.nextInt();
            array[i] = a;
            sum += a;
            i++;

        } while (i < array.length);

        int argsMax = 0;
        int argsMin = (int) Math.pow(10, 7);
        for (int k : array) {
            if (k > argsMax) {
                argsMax = k;
            }
            if (k < argsMin) {
                argsMin = k;
            }
        }

        System.out.println("Sum of numbers " + sum);
        System.out.println("Max value " + argsMax);
        System.out.println("Min value " + argsMin);

    }
}
