package ru.mirea.practice.work1;

import java.util.HashSet;
import java.util.TreeSet;

abstract class Hashset {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("geeks");
        set.add("practice");
        set.add("contribute");
        set.add("ide");
        System.out.println(set);
        TreeSet<String> treeset = new TreeSet<>(set);
        System.out.println(treeset);
    }
}
