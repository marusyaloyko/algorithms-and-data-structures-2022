package ru.mirea.workfourone.task10;

public class Train extends Vehicle {
    private int time;
    private int price;
    private int speed;

    Train(int time, int price, int speed) {
        this.price = price;
        this.speed = speed;
        this.time = time;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public int getPrice() {
        return price;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Train{" +
                "time=" + time +
                ", price=" + price +
                ", speed=" + speed +
                '}';
    }
}


