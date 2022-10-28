package ru.mirea.workthree.mathrandom.task2;

public class Tester {
    private final int a;
    private final Circle[] arr;

    Tester(int a) {
        this.a = a;
        this.arr = new Circle[a];
    }

    public void setCircle(Circle k, int z) {
        this.arr[z] = k;
    }

    public double getbig() {
        double max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getR() > max) {
                max = arr[i].getR();
            }
        }
        return max;
    }

    public double getsmall() {
        double min = arr[0].getR();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getR() < min) {
                min = arr[i].getR();
            }
        }
        return min;
    }

    public void sort() {
        for (int i = 0; i < this.a - 1; i++) {
            for (int j = 1; j < this.a; j++) {
                if (this.arr[i].getR() > this.arr[j].getR()) {
                    Circle buff = this.arr[j];
                    this.arr[j] = this.arr[i];
                    this.arr[i] = buff;
                }
            }
        }
    }

    public String toString() {
        System.out.println("\n");
        for (int i = 0; i < this.a; i++) {
            System.out.println("{" + this.arr[i].toString() + "}");
        }
        return " ";
    }

    public static void main(String[] args) {
        Point point = new Point(35, 24);
        Circle a = new Circle(point, Math.random());
        Circle b = new Circle(point, Math.random());
        Circle c = new Circle(point, Math.random());

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        Tester arr = new Tester(3);
        arr.setCircle(a, 0);
        arr.setCircle(b, 1);
        arr.setCircle(c, 2);

        System.out.println(arr.getbig());
        System.out.println(arr.getsmall());

        arr.sort();

        System.out.println(arr);
    }
}