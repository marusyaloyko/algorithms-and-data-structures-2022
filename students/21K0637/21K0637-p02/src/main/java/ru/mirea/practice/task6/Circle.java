package ru.mirea.practice.task6;

public class Circle {
    static final double PI = 3.14;
    private int radius;
    private int xCenter, yCenter;

    public Circle(int radius, int x_center, int y_center) {
        this.radius = radius;
        this.xCenter = x_center;
        this.yCenter = y_center;
    }

    public int getRadius() {
        return radius;
    }

    public void getCenter() {
        System.out.printf("{%d; %d}", xCenter, yCenter);
    }

    public double Square() {
        return PI * radius * radius;
    }

    public double Length() {
        return 2 * PI * radius;
    }

    public int compareTo(Circle circle) {
        if (this.Square() > circle.Square()) return 1;
        else if (this.Square() == circle.Square()) return 0;
        return -1;
    }
}
