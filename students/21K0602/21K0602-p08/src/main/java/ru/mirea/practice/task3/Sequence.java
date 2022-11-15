package ru.mirea.practice.task3;

public abstract class Sequence {

    public static String recursion(Integer a, Integer b) {
        if (b.equals(a)) {
            System.out.println(a.toString());
        } else if (a > b) {
            b++;
            System.out.println(recursion(a, b) + (b - 1));
        } else {
            b--;
            System.out.println(recursion(a, b) + (b + 1));
        }
        return "";
    }

    public static void main(String[] args) {
        Sequence.recursion(12, 3);
    }

}
