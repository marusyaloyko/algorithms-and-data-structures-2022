package ru.mirea.practice.s21K0598;

import java.util.Scanner;
public class One_1 {
    public static void main(String[] args){
        int maslet;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("Введите размер массива в виде целого числа");
            maslet = sc.nextInt();
        }while(maslet<=0);
        int[] mas = new int[maslet];
        int massume = 0;
        System.out.println("Введите целое значение массива: ");
        for (int i = 0; i<maslet; i++){
            mas[i] = sc.nextInt();
            massume+=mas[i];
        }
        int avenum = massume/maslet;
        System.out.print("Среднее значение массива: ");
        System.out.print(avenum);
    }
}
