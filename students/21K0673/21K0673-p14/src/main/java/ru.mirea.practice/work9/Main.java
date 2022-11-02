package ru.mirea.practice.work9;

import java.util.regex.Pattern;

abstract class Main {
    public static void main(String[] args) {
        String string = "soeiugh seoiugh aseoiguh";
        Pattern pattern = Pattern.compile(" ");
        String[] words = pattern.split(string);
        for (String word : words) {
            System.out.println(word);
        }
    }
}
