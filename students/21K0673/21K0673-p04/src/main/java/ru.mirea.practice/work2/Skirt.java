package ru.mirea.practice.work2;

public class Skirt extends Clothes {
    InterfaceWomenClothing womenClothing;

    public Skirt(EnumAtelier clothing_size, double cost, String colour) {
        this.clothing_size = clothing_size;
        this.colour = colour;
        this.cost = cost;
    }
}
