package ru.mirea.practice.work4;

import static java.lang.Math.atan;
import static java.lang.Math.pow;

public class MathFunc implements MathCalculable {
    private double x;
    private double y;
    private String num;

    MathFunc(int x, int y) {
        this.x = x;
        this.y = y;
        this.num = x + " + i*" + y;
    }

    @Override
    public String exponentiation(int indicator) {
        return pow(this.module(), indicator) + "e^(i*" + atan(y / x) * indicator + ")";
    }

    @Override
    public double module() {
        return pow(x * x + y * y, 0.5);
    }

    public static void main(String[] args) {
        MathCalculable a = new MathFunc(3, 4);
        System.out.println(a.module());
        System.out.println(a.exponentiation(3));
    }

}
