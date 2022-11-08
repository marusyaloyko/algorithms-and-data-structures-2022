package ru.mirea.worktwo.Circle;

public class Tester {
    public static Circle[] arrCircle;
    public static int N;

    public static void main(String[] args) {
        Circle a = new Circle(1.3, 2.5, 6);
        Circle b = new Circle(0.0, 0.0, 4.6);
        Circle c = new Circle(150.5, 12.0, 1.2);
        N = 3;
        arrCircle = new Circle[N];
        arrCircle[0] = a;
        arrCircle[1] = b;
        arrCircle[2] = a;
        System.out.println(arrCircle[0]);
        System.out.println(arrCircle[1]);
        System.out.println(arrCircle[2]);
    }
}
