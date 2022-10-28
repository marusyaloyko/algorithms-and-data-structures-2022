package ru.mirea.practice.work2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingStudentbygpa implements Comparator<SortingStudentbygpa> {

    int mark;

    public int getMark() {
        return this.mark;
    }

    SortingStudentbygpa(int mark) {
        this.mark = mark;
    }

    public static void main(String[] args) {
        List<SortingStudentbygpa> list = new ArrayList<SortingStudentbygpa>();
        list.add(new SortingStudentbygpa(100));
        list.add(new SortingStudentbygpa(23));
        list.add(new SortingStudentbygpa(32));
        list.add(new SortingStudentbygpa(14));
        list.add(new SortingStudentbygpa(11));

        Collections.sort(list, new SortingStudentbygpa(1));

        for (SortingStudentbygpa sortingStudentbygpa : list) {
            System.out.println(sortingStudentbygpa.getMark());
        }
    }

    @Override
    public int compare(SortingStudentbygpa o1, SortingStudentbygpa o2) {
        if (o1.getMark() == o2.getMark()) {
            return 0;
        }
        if (o1.getMark() < o2.getMark()) {
            return 1;
        }
        return -1;
    }
}
