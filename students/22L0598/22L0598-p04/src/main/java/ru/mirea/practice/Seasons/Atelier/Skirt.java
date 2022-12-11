package ru.mirea.practice.Seasons.Atelier;
public class Skirt extends Clothes implements FemaleClothes {
    public Skirt(Sizes size, String color) {
        super(size, color);
    }
    public Skirt(Sizes size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Skirt{" +
                "size = " + getSize() +
                ", color = " + getCost() + " dollars" +
                ", cost = " + getColor() +
                "}";
    }
}