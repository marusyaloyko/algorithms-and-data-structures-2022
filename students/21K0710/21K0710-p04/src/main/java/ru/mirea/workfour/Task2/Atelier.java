package ru.mirea.workfour.Task2;

public class Atelier {
    public void dressWomen(Clothes arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i].dressWomen();
        }
    }

    public void dressMan(Clothes arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i].dressMan();
        }
    }
}
