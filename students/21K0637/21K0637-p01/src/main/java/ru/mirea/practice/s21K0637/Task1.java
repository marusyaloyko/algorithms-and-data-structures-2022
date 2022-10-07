package ru.mirea.practice.s21K0637;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Inter 10 numbers");
        Scanner sc = new Scanner(System.in);
        int[] Array = new int[10];
        int Sum = 0;
        double ArithmeticAverage;
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
            Sum += Array[i];
        }
        ArithmeticAverage = (double)Sum/Array.length;
        System.out.println("Sum: " + Sum);
        System.out.println("Arithmetic Average: " + ArithmeticAverage);
    }
}
