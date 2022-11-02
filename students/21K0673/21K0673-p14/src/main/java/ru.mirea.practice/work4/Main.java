package ru.mirea.practice.work4;

import java.util.regex.Pattern;

abstract class Main {
    public static void main(String[] args) {
        String string = "(1 + 8) – 9 / 4";
        Pattern pattern = Pattern.compile(" ");
        String[] words = pattern.split(string);
        for (String word : words) {
            System.out.println(word);
        }
    }
}
