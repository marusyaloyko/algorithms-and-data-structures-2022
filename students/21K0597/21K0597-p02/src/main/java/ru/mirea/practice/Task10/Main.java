package ru.mirea.practice.Task10;

import java.util.Scanner;

abstract class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println(in.nextLine().split("\\s+").length);
        }
    }
}
