package ru.mirea.workfour.Task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    ArrayList<Product> basket = new ArrayList<>();

    public void getCategory(Categories category, Product arr[]) {
        ArrayList<Product> temp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getCategory() == category) {
                System.out.println(arr[i]);
                temp.add(arr[i]);
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Напишите номер товара, который хотите добавить в корзину:");
        int a = sc.nextInt() - 1;
        basket.add(temp.get(a));
        temp.clear();
    }

    public void printCategories() {
        System.out.println("Доступные категории:");
        for (Categories category : Categories.values()) {
            System.out.println(category);
        }
    }

    public void getBasket() {
        for (int i = 0; i < basket.size(); i++) {
            System.out.println(basket.get(i));
        }
    }

    public double finalPrice() {
        double a = 0;
        for (int i = 0; i < basket.size(); i++) {
            a += basket.get(i).getPrice();
        }
        return a;
    }
}
