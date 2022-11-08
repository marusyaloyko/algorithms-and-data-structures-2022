package ru.mirea.practice.work3;

public class Multiply<T> {
    private String mul;

    Multiply(T a, T b) {
        mul = a.toString() + " * " + b.toString();
    }

    public String getMul() {
        return mul;
    }

    public int evaluate(int i) {
        return i;
    }

    @Override
    public String toString() {
        return mul;
    }
}
