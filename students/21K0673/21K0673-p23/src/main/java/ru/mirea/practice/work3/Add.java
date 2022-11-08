package ru.mirea.practice.work3;

abstract class Add<T> {
    private String sum;

    Add(T a, T b) {
        sum = a.toString() + " + " + b.toString();
    }

    public String getSum() {
        return sum;
    }

    public int evaluate(int i) {
        return i;
    }

    @Override
    public String toString() {
        return sum;
    }
}
