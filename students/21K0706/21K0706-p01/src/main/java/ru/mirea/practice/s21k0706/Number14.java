package ru.mirea.practice.s21k0706;

public final class Number14 {
    private  Number14() {

    }

    public static void main(String[] args) {
        System.out.println("The first 10 numbers of the harmonic series: ");
        for (int i = 0; i < 10; i++) {
            double k = i;
            System.out.printf("%.2f\n", 1 / (k + 1));
        }
    }
}
