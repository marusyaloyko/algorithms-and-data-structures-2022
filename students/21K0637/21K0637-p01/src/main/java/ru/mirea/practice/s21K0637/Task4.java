package ru.mirea.practice.s21K0637;

public class Task4 {
    public static int GSD(int a, int b) {
        while (b !=0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static void main(String[] args) {
        int harmonicNumerator = 1;
        int harmonicDenomerator = 1;
        System.out.println("1: " + harmonicNumerator + "/" + harmonicDenomerator);
        for (int i = 2; i <= 10; i++) {
            harmonicNumerator = harmonicNumerator*i + harmonicDenomerator;
            harmonicDenomerator *= i;

            int gsd = GSD(harmonicDenomerator, harmonicNumerator);
            harmonicNumerator = harmonicNumerator/gsd;
            harmonicDenomerator = harmonicDenomerator/gsd;

            System.out.println(i + ": " + harmonicNumerator + "/" + harmonicDenomerator);
        }
    }
}
