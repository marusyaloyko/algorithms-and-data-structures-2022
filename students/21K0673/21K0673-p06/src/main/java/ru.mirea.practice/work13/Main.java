package ru.mirea.practice.work13;

public class Main {
    public static void main(String[] strings) {
        OvservableString undoablestringbuilder = new OvservableString();
        undoablestringbuilder.setOnChangeListener(new MyListener());
        undoablestringbuilder.append("Hello");
        undoablestringbuilder.append(", ");
        undoablestringbuilder.append("World!");
    }
}
