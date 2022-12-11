package ru.mirea.practice.Seasons.Atelier;

public class TShirt  extends Clothes implements MaleClothes, FemaleClothes{
    public TShirt(Sizes size, String color) {
        super(size, color);
    }
    public TShirt(Sizes size, String color, double cost) {
        super(size, color, cost);
    }
    public String toString() {
        return "TShirt{" +
                "Size = " + getSize() +
                ", cost = " + getCost() + " dollars" +
                ", color = " + getColor() +
                "}";
    }
}