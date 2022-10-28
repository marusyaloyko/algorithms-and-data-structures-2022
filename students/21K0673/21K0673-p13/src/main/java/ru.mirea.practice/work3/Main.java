package ru.mirea.practice.work3;

public class Main {
    public static void main(String[] args) {
        String strings = "Страна; Регион; Город; Улица. Дом/ Корпус, Квартира";
        Address address = new Address(strings, false);
        System.out.println(address.toString());
    }
}
