package ru.mirea.practice.work3;

import java.util.ArrayList;
import java.util.Collections;
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

    public static void main(String[] args) {
        List<Main> list1 = new ArrayList<Main>();
        list1.add(new Main(12));
        list1.add(new Main(24));
        list1.add(new Main(27));

        List<Main> list2 = new ArrayList<Main>();
        list2.add(new Main(100));
        list2.add(new Main(23));
        list2.add(new Main(32));

        List<Main> newList = Stream.concat(list1.stream(), list2.stream()).toList();

    }
}
