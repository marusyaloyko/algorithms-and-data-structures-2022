package ru.mirea.practice.work2;

import ru.mirea.practice.work1.Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGPA implements Comparator<SortingStudentsByGPA> {

    int mark;

    public int getMark() {
        return this.mark;
    }

    SortingStudentsByGPA(int mark) {
        this.mark = mark;
    }

    public static void main(String[] args) {
        List<SortingStudentsByGPA> list = new ArrayList<SortingStudentsByGPA>();
        list.add(new SortingStudentsByGPA(100));
        list.add(new SortingStudentsByGPA(23));
        list.add(new SortingStudentsByGPA(32));
        list.add(new SortingStudentsByGPA(14));
        list.add(new SortingStudentsByGPA(11));

        Collections.sort(list, new SortingStudentsByGPA(1));

        for (SortingStudentsByGPA sortingStudentsByGPA : list) {
            System.out.println(sortingStudentsByGPA.getMark());
        }
    }

    @Override
    public int compare(SortingStudentsByGPA o1, SortingStudentsByGPA o2) {
        if (o1.getMark() == o2.getMark()) {
            return 0;
        }
        if (o1.getMark() < o2.getMark()) {
            return 1;
        }
        return -1;
    }
}
