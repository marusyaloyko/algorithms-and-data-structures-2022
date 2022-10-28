package ru.mirea.practice.work1to3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;

public class SortingStudentsbygpa implements Comparator<SortingStudentsbygpa> {
    public int[] idNumber;

    public void setArray(int[] marks) {
        System.arraycopy(marks, 0, this.idNumber, 0, marks.length);
    }

    SortingStudentsbygpa(int[] arr) {
        this.idNumber = arr;
    }

    public int[] outArray() {
        return this.idNumber;
    }

    public int getMark(int i) {
        return this.idNumber[i];
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Integer[] arr1 = new Integer[5];
        int[] arr2 = new int[5];
        for (int i = 0; i < 5; i++) {
            arr1[i] = rand.nextInt(10);
            arr2[i] = rand.nextInt(10);
        }

        SortingStudentsbygpa a = new SortingStudentsbygpa(arr2);
        a.setArray(arr2);
        Arrays.sort(arr1, Collections.reverseOrder());

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr1[i]);
        }

        Student student = new Student("sdf", "sdg", "aawf", 32, "sdg");
        Student student1 = new Student("asfa", "asd", "asdg", 12, "dfh");
        Student student2 = new Student("dfg", "dfgs", "asedhrsdg", 123, "vbjj");
        Student[] students = new Student[]{student, student1, student2};
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 1; j < students.length; j++) {
                if ((int) students[i].getName().charAt(0) > (int) students[j].getName().charAt(0)) {
                    Student buff = students[i];
                    students[i] = students[j];
                    students[j] = buff;
                }
            }
        }
        for (int i = 0; i < student.getName().length(); i++) {
            System.out.println(students[i].toString());
        }

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

    @Override
    public int compare(SortingStudentsbygpa o1, SortingStudentsbygpa o2) {
        if (o1 == o2) {
            return 0;
        }
        for (int i = 0; i < idNumber.length - 1; i++) {
            for (int j = 1; j < idNumber.length; j++) {
                if (o1.getMark(i) < o2.getMark(j)) {
                    return 1;
                }
            }
        }
        return -1;
    }

    public static List<Main> mergeSort(List<Main> newList) {
        if (newList == null) {
            return null;
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

    public static int[] mergeSort(int[] arr) {
        if (arr == null) {
            return null;
        }
        if (arr.length < 2) {
            return arr;
        }

        int[] left = new int[arr.length / 2];
        int[] right = new int[arr.length - arr.length / 2];

        for (int i = 0; i < arr.length / 2; i++) {
            System.arraycopy(arr, 0, left, 0, arr.length / 2);
        }

        for (int i = arr.length / 2; i < arr.length; i++) {
            int j = i - arr.length / 2;
            System.arraycopy(arr, arr.length / 2, right, 0, arr.length - arr.length / 2);
        }
        mergeSort(left);
        mergeSort(right);

        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] > right[j]) {
                    int buff = left[i];
                    left[i] = right[j];
                    right[j] = buff;
                }
            }
        }
        int k = 0;
        for (int i = 0; i < left.length; i++) {
            arr[i] = left[i];
            k++;
        }
        for (int i = k; i < arr.length; i++) {
            int j = i - k;
            arr[i] = right[j];
        }
        return arr;
    }
}
