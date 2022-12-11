package ru.mirea.practice.Seasons.Atelier;

public class DressMakingStudio  {
    public void dressMale(Clothes[] clothes) {
        System.out.println("Male clothes");
        for (Clothes clothe : clothes) {
            if (clothe instanceof MaleClothes) {
                System.out.println(clothe);
            }
        }
    }

    public void dressFemale(Clothes[] clothes) {
        System.out.println("Female clothes");
        for (Clothes clothe : clothes) {
            if (clothe instanceof FemaleClothes) {
                System.out.println(clothe);
            }
        }
    }
}