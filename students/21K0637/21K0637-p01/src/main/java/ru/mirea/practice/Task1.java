package ru.mirea.practice;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Inter 10 numbers");
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int sum = 0;
        double arithmeticAverage;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }
        arithmeticAverage = (double) sum / array.length;
        System.out.println("sum: " + sum);
        System.out.println("Arithmetic Average: " + arithmeticAverage);
    }
}
