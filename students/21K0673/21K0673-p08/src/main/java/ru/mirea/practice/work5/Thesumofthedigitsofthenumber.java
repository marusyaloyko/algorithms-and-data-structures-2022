package ru.mirea.practice.work5;

import java.util.Random;

import static java.lang.Math.pow;

public class Thesumofthedigitsofthenumber {
    private static void sum(int i, int N, int sum) {
        int buff = N;
        buff /= pow(10, i);
        buff %= pow(10, 1);
        sum += buff;
        if (buff == 0 & i != 1) {
            System.out.print(sum);
        } else {
            i++;
            sum(i, N, sum);
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int N = rand.nextInt(10000);
        int i = 0;
        int sum = 0;
        System.out.println(N);
        sum(i, N, sum);
    }
}
