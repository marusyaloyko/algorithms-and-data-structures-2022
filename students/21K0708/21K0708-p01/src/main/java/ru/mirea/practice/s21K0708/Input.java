package ru.mirea.practice.s21K0708;

import java.util.Scanner;

public class Input {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] Array = new int[size];

        for (int i = 0; i<size; i++){
            Array[i] = sc.nextInt();
        }

        int sum = 0;
        int max = 0;
        int min = Array[0];
        int j = 0;
        do{
            sum = sum + Array[j];

            if (Array[j]>max) {
                max = Array[j];
            } else if (Array[j]<min) {
                min = Array[j];
            }

            j++;
        } while (j<size);
        System.out.printf("sum = %d\nmax = %d\nmin = %d\n", sum, max, min);

        sum = 0;
        max = 0;
        min = Array[0];
        j = 0;
        while (j<size){
            sum = sum + Array[j];

            if (Array[j]>max) {
                max = Array[j];
            } else if (Array[j]<min) {
                min = Array[j];
            }

            j++;
        }
        System.out.printf("sum = %d\nmax = %d\nmin = %d", sum, max, min);
    }
}