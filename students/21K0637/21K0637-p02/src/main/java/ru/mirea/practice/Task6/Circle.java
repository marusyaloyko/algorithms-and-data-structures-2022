package ru.mirea.practice.Task6;

public class Circle {
    static final double PI = 3.14;
    private int radius;
    private int x_center, y_center;

    public Circle(int radius, int x_center, int y_center) {
        this.radius = radius;
        this.x_center = x_center;
        this.y_center = y_center;
    }

    public int getRadius() {
        return radius;
    }

    public void getCenter() {
        System.out.printf("{%d; %d}", x_center, y_center);
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
