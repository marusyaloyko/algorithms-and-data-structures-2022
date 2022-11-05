package ru.mirea.practice.s21k0647.zad3;

public class Person {
    String fullName;
    int age;

    Person() {}

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(this.fullName + " говорит");

    }

    public void talk() {
        System.out.println(this.fullName + " говорит");
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Leonid Ivanov", 29);
        person2.move();

    }
}
