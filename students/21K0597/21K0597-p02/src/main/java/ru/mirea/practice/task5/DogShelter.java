package ru.mirea.practice.task5;

import java.util.ArrayList;
import java.util.List;

public class DogShelter {

    private final List<Dog> shelter;
    public int dogCount;

    public DogShelter() {
        dogCount = 0;
        shelter = new ArrayList<Dog>();
    }

    public void addDog(Dog dog) {
        shelter.add(dog);
    }

    public Dog get(int i) {
        return shelter.get(i);
    }

    public void show() {
        System.out.println("Total " + dogCount + " dogs");
        for (int i = 0; i < shelter.size(); i++) {
            System.out.println(i + " " + shelter.get(i).toString());
        }
    }
}
