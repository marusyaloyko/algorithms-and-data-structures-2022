package ru.mirea.practice.simple;

import java.util.StringTokenizer;

public final class JavaKoKo {

    public static void main(String[] args) {
        StringTokenizer tokenizer = new StringTokenizer("", ";!, ");
        while (tokenizer.hasMoreElements()) {
            tokenizer.nextToken();
        }

    }
}
