package ru.mirea.practice.task2;

public abstract class Sequence {

    public static String recursion(int n) {
        if (n == 1) {
            System.out.println("1");
        } else {
            n--;
            System.out.println(recursion(n) + (n + 1));
        }
        return "";
    }

    public static void main(String[] args) {
        Sequence.recursion(12);
    }

}
