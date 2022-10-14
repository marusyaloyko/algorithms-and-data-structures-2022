package ru.mirea.practice6.s21K0709;

public class CircleTest
{
    public static void main(String[] args) {
        Circle obj1 = new Circle(1,1,10,"green");
        Circle obj2 = new Circle(2,3,4,"blue");
        System.out.println(obj1.AreaCircle());
        System.out.println(obj1.LengthCircle());
        System.out.println(obj1);
        System.out.println(obj1.MaxCircle(obj1,obj2));
    }
}
