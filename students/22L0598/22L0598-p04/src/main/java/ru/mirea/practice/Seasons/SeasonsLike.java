package ru.mirea.practice.Seasons;

public class SeasonsLike{
    public static void main(String[] args) {
        Seasons season = Seasons.SUMMER;
        System.out.println(season);
        printAllValues();
        print(Seasons.AUTUMN);
        print(Seasons.SPRING);
        print(Seasons.SUMMER);
        print(Seasons.WINTER);
    }
    public static void print(Seasons season) {
        switch (season) {
            case WINTER :
                System.out.println("Я люблю зиму!");
                break;
            case SPRING :
                System.out.println("Я люблю весну!");
                break;
            case SUMMER :
                System.out.println("Я люблю лето!");
                break;
            case AUTUMN :
                System.out.println("Я люблю осень!");
                break;

        }
    }
    public static void printAllValues() {
        for (Seasons s: Seasons.values() ) {
            System.out.println(s + " " + s.getAvgTmp() + " "
                    + s.getDescription() );
        }
    }
}