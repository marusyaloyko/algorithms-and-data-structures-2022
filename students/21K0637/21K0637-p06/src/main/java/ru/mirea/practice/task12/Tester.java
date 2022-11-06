package ru.mirea.practice.task12;

public abstract class Tester {
    public static void main(String[] args) {
        UndoableStringBuilder stringBuilder = new UndoableStringBuilder();

        stringBuilder.append("Hello ");
        stringBuilder.insert(6, "World");
        System.out.println(stringBuilder);
        stringBuilder.undo();
        stringBuilder.append("Java");
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);
        stringBuilder.undo();
        System.out.println(stringBuilder);
    }
}
