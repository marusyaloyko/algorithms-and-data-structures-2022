package ru.mirea.practice.s21K0647.punkt3;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner source = new Scanner(System.in);
        int n;
        n = source.nextInt();
        Circle c[] = new Circle[n];
        for(int i = 0; i < n; i++){
            Circle a = new Circle();
            a.x =  source.nextDouble();
            a.y =  source.nextDouble();
            a.r =  source.nextDouble();
            c[i] = a;
        }
        for(Circle P: c){
            System.out.println("x: " + P.x + "\ty: " + P.y + "\tRadiuse: " + P.r);

        }
    }
}
