package ru.mirea.workfourone.task10;

public class Car extends Vehicle {
    private int time;
    private int price;

    private int speed;

    Car(int time, int price, int speed) {
        super(time, price, speed);
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getTime() {
        return time;
    }

    @Override
    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" + "time=" + time + ", price=" + price + ", speed=" + speed + '}';
    }
}
