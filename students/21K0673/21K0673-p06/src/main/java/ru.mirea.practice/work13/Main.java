package ru.mirea.practice.work13;

public class Main {
    public static void main(String[] strings) {
        OvservableStringBuilder UndoableStringBuilder = new OvservableStringBuilder();
        UndoableStringBuilder.setOnChangeListener(new MyListener());
        UndoableStringBuilder.append("Hello");
        UndoableStringBuilder.append(", ");
        UndoableStringBuilder.append("World!");
    }
}
