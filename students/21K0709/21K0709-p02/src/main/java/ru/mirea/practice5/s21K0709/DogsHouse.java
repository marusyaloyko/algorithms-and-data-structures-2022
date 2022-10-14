package ru.mirea.practice5.s21K0709;

import java.util.ArrayList;

public class DogsHouse
{
    private ArrayList<Dog> dogs = new ArrayList<Dog>();
    public void AddDog(Dog obj)
    {
        dogs.add(obj);
    }

    public void setDogs(ArrayList<Dog> dogs) {
        this.dogs = dogs;
    }

    public ArrayList<Dog> getDogs() {
        return dogs;
    }
    public String toString(){
        return "Массив собак:" + dogs ;
    }
}
