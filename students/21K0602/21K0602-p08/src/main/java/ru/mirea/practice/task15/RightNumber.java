package ru.mirea.practice.task15;


public abstract class RightNumber {

    public static String recursion(Integer n) {
        if (n < 10) {
            return n.toString();
        } else {
            return n % 10 + " " + recursion(n / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion(1234));
    }
}