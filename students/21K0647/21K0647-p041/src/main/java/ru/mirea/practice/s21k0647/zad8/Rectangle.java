package ru.mirea.practice.s21k0647.zad8;


import java.util.WeakHashMap;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    Rectangle() {

    }

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public String toString() {
        String s = "Закрашенный";
        if(filled){
            s = "Полый";
        }
        return "Прямоугольник со сторонами " + width + " " + length + "\nЦвет:" + color + " " + s + "\nПлощадь: " + this.getArea() + "\nПериметр:" + this.getPerimeter();
    }



}
