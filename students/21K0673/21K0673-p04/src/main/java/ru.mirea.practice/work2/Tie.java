package ru.mirea.practice.work2;

public class Tie extends Clothes {
    InterfaceMenClothing menClothing;

    public Tie(EnumAtelier clothing_size, double cost, String colour) {
        this.clothing_size = clothing_size;
        this.colour = colour;
        this.cost = cost;
    }
}
