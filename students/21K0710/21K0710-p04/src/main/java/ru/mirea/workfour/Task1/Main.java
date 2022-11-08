package ru.mirea.workfour.Task1;

public class Main {
    public static void main(String[] args) {
        Seasons favourite = Seasons.WINTER;
        System.out.println("Зима - холодное время года");
        for (Seasons season : Seasons.values()) {
            System.out.println("Время года: " + season + ", средняя температура: " + season.getTemperature() + ", описание:" + season.getDescription());
        }
    }
}
