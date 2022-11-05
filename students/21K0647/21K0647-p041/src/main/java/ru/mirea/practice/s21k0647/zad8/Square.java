package ru.mirea.practice.s21k0647.zad8;


public class Square extends Rectangle {

    protected double side;

    Square() {

    }

    Square(double side) {
        this.side = side;
    }

    Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public String toString() {
        String s = "Закрашенный";
        if(filled){
            s = "Полый";
        }
        return "Квадрат со сторонами " + side + "\nЦвет:" + color + " " + s + "\nПлощадь: " + this.getArea() + "\nПериметр:" + this.getPerimeter();
    }


}
