package Zadanie3;

public class Tester{
    private int n = 3;

    Circle[] k = new Circle[n];

    public static void main(String[] args) {
        Circle[] k = {
                new Circle(new Point(5,6),8),
                new Circle(new Point(5,0),9),
        };
        System.out.println(k[1].toString());
    }

}
