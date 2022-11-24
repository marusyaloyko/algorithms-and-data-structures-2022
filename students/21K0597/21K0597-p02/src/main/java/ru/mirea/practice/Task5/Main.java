package ru.mirea.practice.Task5;

import java.util.ArrayList;
import java.util.List;

abstract class Main {
    public static void main(String[] args) {
        DogShelter konura1 = new DogShelter();
        konura1.addDog(new Dog("Sobakich", 4));
        konura1.addDog(new Dog("Sobaka", 10));
        System.out.print(konura1.get(0).convertAge());
    }
}
