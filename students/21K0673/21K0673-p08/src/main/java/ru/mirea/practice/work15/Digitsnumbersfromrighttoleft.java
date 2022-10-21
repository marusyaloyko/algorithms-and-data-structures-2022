package ru.mirea.practice.work15;

import java.util.Random;

import static java.lang.Math.pow;

public class Digitsnumbersfromrighttoleft {
    private static void rec(int i, int N) {
        int buff = N;
        buff /= pow(10, i);
        buff %= pow(10, 1);
        if (buff == 0 & i != 1) {
            System.out.println("");
        } else {
            System.out.print(buff);
            System.out.print(" ");
            i++;
            rec(i, N);
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int N = rand.nextInt(10000);
        int i = 0;
        System.out.println(N);
        rec(i, N);
    }
}
