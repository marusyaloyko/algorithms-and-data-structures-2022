package ru.mirea.practice.task3.task9;

public abstract class Furniture {
    private int cost;
    private int weight;

    public Furniture(int cost, int weight) {
        this.cost = cost;
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public int getWeight() {
        return weight;
    }
}
