package ru.mirea.practice.task6;

public class Circle {
    static final double PI = 3.14;
    private int radius;
    private int xCenter, yCenter;

    public Circle(int radius, int xCenter, int yCenter) {
        this.radius = radius;
        this.xCenter = xCenter;
        this.yCenter = yCenter;
    }

    public int getRadius() {
        return radius;
    }

    public void getCenter() {
        System.out.printf("{%d; %d}", xCenter, yCenter);
    }

    public double getSquare() {
        return PI * radius * radius;
    }

    public double getLength() {
        return 2 * PI * radius;
    }

    public int compareTo(Circle circle) {
        if (this.getSquare() > circle.getSquare()) {
            return 1;
        } else if (this.getSquare() == circle.getSquare()) {
            return 0;
        }
        return -1;
    }
}
