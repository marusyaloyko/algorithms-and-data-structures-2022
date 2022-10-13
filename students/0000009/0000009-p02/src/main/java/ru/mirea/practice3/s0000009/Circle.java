package ru.mirea.practice3.s0000009;
public class Circle
{
    private double r;
    private String color;
    private Point p = new Point();
    public Circle(){}
    public Circle(Point p,double r)
    {
        this.p = p;
        this.r = r;
    }
    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    @Override
    public String toString(){
        return "Координаты: " + "p:  " + p + " r = " + r;
    }
}
