package ru.mirea.practice.work3;

abstract class Main {
    public static void main(String[] args) {
        new Subtract(new Multiply(new Const(5), new Variable("x")), new Const(1)).evaluate(5);
    }
}
