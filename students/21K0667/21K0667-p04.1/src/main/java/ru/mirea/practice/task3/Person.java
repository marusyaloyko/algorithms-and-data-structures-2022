package ru.mirea.practice.task3;

public class Person {
    private String fullName;
    private int age;

    public void move() {
        System.out.println(fullName + " идет");
    }

    public void talk() {
        System.out.println(fullName + " говорит");
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
        this.fullName = "";
        this.age = 0;
    }

    @Override
    public String toString() {
        return "fullName = " + fullName
                + ", age = " + age;
    }
}
