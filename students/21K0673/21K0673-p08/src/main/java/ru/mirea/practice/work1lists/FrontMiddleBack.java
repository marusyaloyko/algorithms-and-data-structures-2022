package ru.mirea.practice.work1lists;

import java.util.LinkedList;

public class FrontMiddleBack {
    LinkedList a = new LinkedList();
    LinkedList b = new LinkedList();

    FrontMiddleBack() {
    }

    void pushFront(int val) {
        a.addFirst(val);
        System.out.println(a);
    }

    void pushMiddle(int val) {
        for (int i = 0; i <= a.size() / 2 - 1; i++) {
            b.add(i, a.get(i));
        }
        b.add(a.size() / 2, val);
        for (int i = a.size() / 2 + 1; i <= a.size() - 1; i++) {
            b.add(i, a.get(i));
        }
        for (int i = 0; i <= b.size() - 1; i++) {
            a.add(i, b.get(i));
        }
        System.out.println(a);
    }

    void pushBack(int val) {
        a.addLast(val);
        System.out.println(a);
    }

    int popFront() {
        a.remove(0);
        System.out.println(a);
        return 0;
    }

    int popMiddle() {
        System.out.println(a);
        return 0;
    }

    int popBack() {
        a.remove(a.size() - 1);
        System.out.println(a);
        return 0;
    }
}
