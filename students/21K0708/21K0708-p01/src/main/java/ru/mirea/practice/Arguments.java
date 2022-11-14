package ru.mirea.practice;

import org.jetbrains.annotations.NotNull;

public class Arguments {
    public static void main(String @NotNull [] args) {
        for (String arg : args) System.out.println(arg);
    }
}
