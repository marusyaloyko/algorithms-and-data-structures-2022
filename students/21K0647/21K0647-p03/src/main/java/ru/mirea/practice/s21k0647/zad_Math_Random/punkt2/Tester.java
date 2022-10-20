package ru.mirea.practice.s21k0647.zad_Math_Random.punkt2;

import java.util.Scanner;

public class Tester {
    public static String Min_p(Circle[] c) {
        double m = 100000;
        Circle c_min = new Circle();
        for (Circle x: c) {
            if (x.r < m) {
                m = x.r;
                c_min = x;
            }
        }
        return c_min.toString();
    }

    public static String Max_p(Circle[] c) {
        double m = -1;
        Circle c_max = new Circle();
        for (Circle x: c) {
            if (x.r > m) {
                m = x.r;
                c_max = x;
            }
        }
        return c_max.toString();
    }

    public static void Sort_p(Circle[] c) {
        for (int i = 0; i < c.length; ++i) {
            for (int j = i + 1; j < c.length; ++j) {
                if (c[i].r > c[j].r) {
                    Circle x = c[i];
                    c[i] = c[j];
                    c[j] = x;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner source = new Scanner(System.in);
        int n = 3;
        Circle[] c =new Circle[n];
        for (int i = 0; i < n; i++) {
            Circle a = new Circle();
            a.x =  (int)(Math.random() * 100);
            a.y =  (int)(Math.random() * 100);
            a.r =  (int)(Math.random() * 100);
            c[i] = a;
        }
        System.out.println("Circles");
        for (Circle P: c) {
            System.out.println("x: " + P.x + "\ty: " + P.y + "\tRadiuse: " + P.r);
        }

        System.out.println("\nMin Circle: " + Min_p(c));
        System.out.println("Max Circle: " + Max_p(c) + "\n");
        Sort_p(c);
        System.out.println("Sorteed Circles");
        for (Circle x: c) {
            System.out.println(x.toString());
        }
    }
}
