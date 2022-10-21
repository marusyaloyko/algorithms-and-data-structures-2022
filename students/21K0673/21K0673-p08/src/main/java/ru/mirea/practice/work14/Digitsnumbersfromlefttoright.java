package ru.mirea.practice.work14;

import java.util.Random;

import static java.lang.Math.pow;

public class Digitsnumbersfromlefttoright {
    private static void amount(int i, int N) {
        int buff = N;
        buff /= pow(10, i);
        if (buff == 0) {
            norm(i, N);
        } else {
            i++;
            amount(i, N);
        }
    }

    private static void norm(int i, int N) {
        int buff = N;
        buff /= pow(10, i - 1);
        buff %= pow(10, 1);
        if (buff == 0 & i != 1) {
            System.out.println("");
        } else {
            System.out.print(buff);
            System.out.print(" ");
            i--;
            norm(i, N);
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int N = rand.nextInt(10000);
        int i = 1;
        System.out.println(N);
        amount(i, N);
    }
}
