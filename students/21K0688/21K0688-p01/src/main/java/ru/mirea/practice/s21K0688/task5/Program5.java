package ru.mirea.practice.s21K0688.task5;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = sc.nextInt();
        System.out.print(Factorial.factor(a));
    }
}
