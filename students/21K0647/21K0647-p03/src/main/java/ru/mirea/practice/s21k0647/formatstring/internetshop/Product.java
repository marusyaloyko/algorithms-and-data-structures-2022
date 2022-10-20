package ru.mirea.practice.s21k0647.formatstring.internetshop;

public class Product {
    int price;
    String name;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }
}
