package ru.mirea.practice.work3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    int mark;

    public int getMark() {
        return this.mark;
    }

    Main(int mark) {
        this.mark = mark;
    }

    public static List<Main> mergeSort(List<Main> newList) {
        if (newList == null) {
            return newList;
        }
        if (newList.size() < 2) {
            return newList;
        }

        List<Main> left = new ArrayList<>(newList.size() / 2);
        List<Main> right = new ArrayList<>(newList.size() - newList.size() / 2);

        for (int i = 0; i < newList.size() / 2; i++) {
            left.add(i, newList.get(i));
        }

        for (int i = newList.size() / 2; i < newList.size(); i++) {
            int j = i - newList.size() / 2;
            right.add(j, newList.get(i));
        }
        mergeSort(left);
        mergeSort(right);

        for (int i = 0; i < left.size(); i++) {
            for (int j = 0; j < right.size(); j++) {
                if (left.get(i).getMark() > right.get(j).getMark()) {
                    Main buff = new Main(left.get(i).getMark());
                    left.set(i, right.get(j));
                    right.set(j, buff);
                }
            }
        }
        int k = 0;
        for (int i = 0; i < left.size(); i++) {
            newList.set(i, left.get(i));
            k++;
        }
        for (int i = k; i < newList.size(); i++) {
            int j = i - k;
            newList.set(i, right.get(j));
        }
        return newList;
    }

    public static void main(String[] args) {
        List<Main> list1 = new ArrayList<>(3);
        list1.add(new Main(27));
        list1.add(new Main(132));
        list1.add(new Main(1));

        List<Main> list2 = new ArrayList<>(3);
        list2.add(new Main(100));
        list2.add(new Main(23));
        list2.add(new Main(11));

        List<Main> newList = new ArrayList<>(Stream.concat(list1.stream(), list2.stream()).toList());

        for (int i = 0; i < newList.size(); i++) {
            System.out.println(mergeSort(newList).get(i).getMark());
        }
    }
}
