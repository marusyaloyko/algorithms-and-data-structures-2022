package ru.mirea.practice.Seasons.Atelier;

public class Trousers  extends Clothes implements MaleClothes, FemaleClothes {

    public Trousers(Sizes size, String color) {
        super(size, color);
    }

    public Trousers(Sizes size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Trousers{" +
                "size = " + getSize() +
                ", cost = " + getCost() + " dollars" +
                ", color = " + getColor() +
                "}";
    }
}
