package ru.mirea.practice;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number od array elements: ");
        int am = sc.nextInt();
        int i = 0, sum = 0;
        int max_value = -999999999;
        int min_value = 999999999;
        int[] num = new int[am];
        while(i < am){
            num[i] = sc.nextInt();
            if (num[i] > max_value){
                max_value = num[i];
            }
            if (num[i] < min_value){
                min_value = num[i];
            }
            sum += num[i];
            i++;
        }
        System.out.print("Sum: " + sum + "\n" + "Max: " + max_value + "\n" + "Min: " + min_value);
    }
}
