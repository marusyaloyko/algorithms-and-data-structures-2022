package ru.mirea.practice;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number od array elements: ");
        int am = sc.nextInt();
        int[] num = new int[am];
        int sum = 0;
        System.out.printf("Enter " + am + " numbers sequentially ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            sum += num[i];
        }
        System.out.print("sum: " + sum + "\n" + "Average:" + sum / num.length);
    }
}
