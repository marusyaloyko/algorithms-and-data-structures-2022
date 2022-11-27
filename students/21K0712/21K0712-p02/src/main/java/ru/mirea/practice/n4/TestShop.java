package ru.mirea.practice.n4;

import java.util.ArrayList;
import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        Computer[] clist = new Computer[0];
        Computer c1 = new Computer("12900k", "asus rog strix", "3080ti", "16 DDR4");
        clist.add(c1);
        ArrayList<String> i = new ArrayList<>();
        int j = 0;
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter (exit) if you want to leave");


                System.out.println("Enter CPU: ");
                i.add(sc.next());
                System.out.println("Enter motherboard: ");
                i.add(sc.next());
                System.out.println("Enter GPU: ");
                i.add(sc.next());
                System.out.println("Enter RAM: ");
                i.add(sc.next());


                if (i.contains("exit")) {
                    break;
                }
                Computer c = new Computer(i.get(j), i.get(j + 1), i.get(j + 2), i.get(j + 3));
                clist.add(c);
                j += 4;
            }
        }
        Shop s = new Shop();
        s.setList(clist);
        System.out.println(s.find(0).toString());
        s.delete(c1);
        System.out.println(s.find(c1).toString());
        s.add(c1);
        System.out.println(s.toString());
    }
}
