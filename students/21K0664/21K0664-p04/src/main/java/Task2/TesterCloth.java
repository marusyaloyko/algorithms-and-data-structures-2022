package Task2;

public class TesterCloth {
    public static void main(String[] args) {
        System.out.println("\nЗадание 4.2\n");
        clothSize clothSizes = clothSize.XS;
        clothSize.allSize();
        Pants a = new Pants(clothSize.L, 500, "Red");
        TShirt b = new TShirt(clothSize.XXS, 1200, "Blue");
        Tie c = new Tie(clothSize.XS, 2000, "Orange");
        Skirt d = new Skirt(clothSize.M, 6000, "Green");
        Clothing[] clothes = {a, b, c, d};
    }
}
