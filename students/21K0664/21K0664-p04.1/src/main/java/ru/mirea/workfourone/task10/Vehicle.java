package ru.mirea.workfourone.task10;

public abstract class Vehicle {

    protected int time;
    protected int price;
    protected int speed;

    Vehicle(int time, int price, int speed) {
        this.time = time;
        this.speed = speed;
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getPrice() {
        return price;
    }

    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "time=" + time + ", price=" + price + ", speed=" + speed + '}';
    }
}
