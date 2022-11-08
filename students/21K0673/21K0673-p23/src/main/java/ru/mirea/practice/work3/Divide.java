package ru.mirea.practice.work3;

public class Divide<T> {
    private String div;

    Divide(T a, T b) {
        div = a.toString() + " / " + b.toString();
    }

    public String getDiv() {
        return div;
    }

    public int evaluate(int i) {
        return i;
    }

    @Override
    public String toString() {
        return div;
    }
}
