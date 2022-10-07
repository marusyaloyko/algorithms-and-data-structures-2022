package ru.mirea.practice.s21K0637;

public class Task5 {
    public static void main(String[] args) {
        int res = factorial(6);
        System.out.println(res);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n*factorial(n-1);
    }
}
