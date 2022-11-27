package ru.mirea.practice.n4;

import ru.mirea.practice.n3.Circle;

import java.util.ArrayList;

public class Shop {

    Computer[] list = new Computer[0];
    int counter;

    public Shop(Computer[] list) {
        this.list = list;
    }

    public Shop() {
    }

    public Computer[] getList() {
        return list;
    }

    public void setList(Computer[] list) {
        this.list = list;
    }

    public void add(Computer comp) {
        list[];
    }

    public void delete(Computer comp) {
        for (int i = 0; i < list.size(); i++) {
            if (comp == list.get(i)) {
                list.remove(i);
            }
        }
    }

    public ArrayList find(Computer comp) {
        ArrayList<Integer> founded = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (comp.equals(list.get(i))) {
                founded.add(i);
            }
        }
        return founded;
    }

    public Computer find(int i) {
        return list.get(i);
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < list.size(); i++) {
            s += list.get(i).toString();
        }
        return "Shop{"
                +
                "list=" + s
                +
                '}';
    }
}
