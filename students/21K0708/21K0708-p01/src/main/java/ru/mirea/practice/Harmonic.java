package ru.mirea.practice;

public class Harmonic {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            if (i == 1) {
                System.out.println("1");
            } else {
                System.out.printf("1/%d\n", i);
            }
        }
    }
}
