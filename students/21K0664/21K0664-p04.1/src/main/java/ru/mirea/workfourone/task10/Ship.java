package ru.mirea.workfourone.task10;

public class Ship extends Vehicle {
    private int time;
    private int price;

    private int speed;

    Ship(int time, int price, int speed) {
        this.price = price;
        this.speed = speed;
        this.time = time;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPrice() {
        return price;
    }

    public int getTime() {
        return time;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "time=" + time +
                ", price=" + price +
                ", speed=" + speed +
                '}';
    }
}

