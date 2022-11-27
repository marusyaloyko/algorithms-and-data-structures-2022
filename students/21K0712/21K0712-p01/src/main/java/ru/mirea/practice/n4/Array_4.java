package ru.mirea.practice.n4;

import java.util.Scanner;

public class Array_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int a[] = new int[n];
        int sum = 0, i=0, max = 0, min = 999999;
        while (i<=n)
        {
            a[i] = sc.nextInt();
            sum+=a[i];
            if (max<a[i]) max=a[i];
            if (min>a[i]) min=a[i];
            i++;
        }
        System.out.println("max = "+max+" min = "+min);
    }

}
