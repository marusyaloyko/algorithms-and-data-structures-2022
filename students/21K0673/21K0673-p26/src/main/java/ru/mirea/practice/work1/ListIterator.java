package ru.mirea.practice.work1;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Stack;

class ListIterator implements Iterator<Integer> {
    private final List<Integer> list;
    private int index;
    private boolean removeCalled;

    ListIterator(List<Integer> list) {
        this.list = list;
        index = 0;
        removeCalled = false;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Integer result = list.get(index);
        index++;
        return result;
    }

    @Override
    public void remove() {
        if (removeCalled) {
            throw new IllegalStateException("remove уже вызван");
        }
        if (index == 0) {
            throw new IllegalStateException("next не был вызван");
        }
        index--;
        list.remove(index);
        removeCalled = true;
    }

    public void invert() {
        Stack stack = new Stack<>();
        System.out.println(stack);
    }
}

