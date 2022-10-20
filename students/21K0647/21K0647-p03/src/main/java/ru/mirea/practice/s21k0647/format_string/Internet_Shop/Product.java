package ru.mirea.practice.s21k0647.format_string.Internet_Shop;

public class Product {
    int price;
    String Name;

    public Product(String Name, int price) {
        this.Name = Name;
        this.price = price;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return Name;
    }
}
