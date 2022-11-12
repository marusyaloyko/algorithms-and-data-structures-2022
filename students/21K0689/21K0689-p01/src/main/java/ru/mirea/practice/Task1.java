package ru.mirea.practice;

public class Task1 {
    public static void main(String[] args) {
        int [] a = {1,23,4,235,346,123};
        double sum = 0;
        double average;
        for (int j : a) {
            System.out.println(j);
            sum += j;
        }
        average = sum / a.length;
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }
}
