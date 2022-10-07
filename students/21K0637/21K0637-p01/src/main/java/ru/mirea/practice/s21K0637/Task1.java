package ru.mirea.practice.s21K0637;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите 10 чисел");
        Scanner sc = new Scanner(System.in);
        int[] Array = new int[10];
        int Sum = 0;
        double ArithmeticAverage;
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
            Sum += Array[i];
        }
        ArithmeticAverage = (double)Sum/Array.length;
        System.out.println("Сумма: " + Sum);
        System.out.println("Среднее арифметическое: " + ArithmeticAverage);
    }
}
