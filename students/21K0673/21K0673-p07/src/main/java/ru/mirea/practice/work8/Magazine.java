package ru.mirea.practice.work8;

import java.awt.print.Printable;

public class Magazine {
    public static void printMagazines(Printable[] printable) {
        for (int i = 0; i < printable.length; i++) {
            System.out.println(printable[i] instanceof Magazine);
        }
    }
}
