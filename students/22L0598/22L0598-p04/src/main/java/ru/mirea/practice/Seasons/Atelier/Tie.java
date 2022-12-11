package ru.mirea.practice.Seasons.Atelier;

public class Tie extends Clothes implements MaleClothes {
    public Tie(Sizes size, String color) {
        super(size, color);
    }
    public Tie(Sizes size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Tie{" +
                "size = " + getSize() +
                ", color = " + getCost() + " dollars" +
                ", cost = " + getColor() +
                "}";
    }
}

