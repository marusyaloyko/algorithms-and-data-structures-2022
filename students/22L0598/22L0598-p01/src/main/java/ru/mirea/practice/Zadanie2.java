package ru.mirea.practice;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int k = 0;
        int i = 0;
        int max = 0;
        int min = 0;

        k=sc.nextInt();
        int [] mass=new int[k];
        while(i<k){
            mass[i] = sc.nextInt();
            if(i==0){
                max=mass[i];
                min=mass[i];
            }
            if(max<mass[i]) max=mass[i];
            if(min>mass[i]) min=mass[i];

            a+=mass[i];
            i++;
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(a);
    }
}
