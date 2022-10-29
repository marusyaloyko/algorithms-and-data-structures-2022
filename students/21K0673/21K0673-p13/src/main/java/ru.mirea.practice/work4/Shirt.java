package ru.mirea.practice.work4;

public class Shirt {
    private String[] strings;

    Shirt(String[] strings) {
        this.strings = strings;
    }

    public String toString() {
        String buff = "";
        for (int i = 0; i < strings.length; i++) {
            buff += strings[i] + "\n";
        }
        return buff;
    }
}
