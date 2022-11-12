package ru.mirea.practice.s21K0689;

import java.util.Scanner;

public class Task2 {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array: ");
        int size = sc.nextInt();
        int [] a=new int[size];
        for (int n = 0;n<size;n++)
        {
            a[n] = sc.nextInt();
        }
        int b = 0;
        int sum = 0;
        while (b< a.length)
        {
            sum+=a[b];
            b++;
        }
        System.out.println("sum = " + sum);
        sum = 0;
        b=0;

        do
        {
            sum+=a[b];
            b++;
        }
        while(b<a.length);
        System.out.println("sum = " + sum);

        int max=0;
        int min =a[0] ;
        for (int iterator=0; iterator<size; iterator++)
        {
            if (a[iterator] > max)
            {
                max = a[iterator];
            }
        }
        for (int iterator=0; iterator<size; iterator++)
        {
            if (a[iterator] < min)
            {
                min = a[iterator];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max =" + max);
    }
}
