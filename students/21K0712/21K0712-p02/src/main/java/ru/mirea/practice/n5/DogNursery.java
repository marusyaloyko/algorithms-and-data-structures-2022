package ru.mirea.practice.n5;

import java.util.ArrayList;

public class DogNursery {
    private ArrayList<Dog> list = new ArrayList<>();

    public void add(Dog d) {
        list.add(d);
    }

    public DogNursery(ArrayList<Dog> list) {
        this.list = list;
    }

    public ArrayList<Dog> getList() {
        return list;
    }

    public void setList(ArrayList<Dog> list) {
        this.list = list;
    }

}
