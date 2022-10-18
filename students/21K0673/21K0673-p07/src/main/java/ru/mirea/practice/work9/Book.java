package ru.mirea.practice.work9;

import java.awt.print.Printable;

public class Book {
    public static void printBooks(Printable[] printable) {
        for (int i = 0; i < printable.length; i++) {
            System.out.println(printable[i] instanceof Book);
        }
    }
}
