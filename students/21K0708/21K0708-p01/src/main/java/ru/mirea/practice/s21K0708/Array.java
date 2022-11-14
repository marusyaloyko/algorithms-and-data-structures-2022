package ru.mirea.practice.s21K0708;

public class Array {
    public static void main(String[] args) {
        int[] array = {4, 85, 29, 2, 4, 4};
        int sum = 0;
        double average;

        for (int j : array) {
            sum = sum + j;
        }
        average = (double) sum / array.length;

        System.out.print("sum = " + sum + "\naverage = " + average);
    }
}

