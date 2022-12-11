package ru.mirea.practice;

public class Zadanie1 {
    public static void main(String[] ards){
        int b = 0;
        int k = 10;
        double a;

        int[] mass = new int[k];
        for(int i = 1; i<=k; i++){
            mass[i-1] = i;
            b+=i;
        }
        a = (double) b/k;
        System.out.println(a);
    }
}
