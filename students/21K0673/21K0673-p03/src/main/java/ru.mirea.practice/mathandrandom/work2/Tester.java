package ru.mirea.practice.mathandrandom.work2;

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

    public void getBig() {
        for (int i = 0; i < a; i++) {
            for (int j = i + 1; j < a; ) {
                if (arr[i].getR() < arr[j].getR()) {
                    i = j;
                } else {
                    j++;
                }
            }
            System.out.println(arr[i]);
        }
    }

    public void getSmall() {
        for (int i = 0; i < a; i++) {
            if(arr[i].getR()>arr[i+1].getR()){
                    i++;
            }
            System.out.println(arr[i]);
        }
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
        Point p = new Point(35, 24);
        Circle a = new Circle(p, Math.random());
        Circle b = new Circle(p, Math.random());
        Circle c = new Circle(p, Math.random());

        Tester ar = new Tester(3);
        ar.setCircle(a, 0);
        ar.setCircle(b, 1);
        ar.setCircle(c, 2);

        ar.getBig();
        ar.getSmall();

        ar.sort();

        System.out.println(ar.toString());
    }
}
