package ru.mirea.practice.s21K0598;

import java.util.Scanner;
public class One_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите числоб факториал которого вы желаете найти: ");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = num; i > 0 ; i--){
            fact *=i;
        }
        System.out.print("Факториал числа ");
        System.out.print(num);
        System.out.print(" = ");
        System.out.print(fact);
    }
}
