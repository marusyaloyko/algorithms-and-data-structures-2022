package ru.mirea.practice.task6;

public class Circle {
    static final double PI = 3.14;
    private int radius;
    private int xcenter, ycenter;

    public Circle(int radius, int xCenter, int yCenter) {
        this.radius = radius;
        this.xcenter = xCenter;
        this.ycenter = yCenter;
    }

    public int getRadius() {
        return radius;
    }

    public void getCenter() {
        System.out.printf("{%d; %d}", xcenter, ycenter);
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
