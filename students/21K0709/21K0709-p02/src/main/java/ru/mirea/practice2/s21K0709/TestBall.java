package ru.mirea.practice2.s21K0709;
public class TestBall {
    public static void main(String[] args)
    {
        Ball obj1 = new Ball();
        Ball obj2 = new Ball(2.5,3.4);
        System.out.println(obj1);
        System.out.println(obj2);
        obj1.setXY(32,33);
        System.out.println(obj1);
    }
}
