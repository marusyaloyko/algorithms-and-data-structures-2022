package ru.mirea.practice.work1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Listing implements Iterable<Integer> {
    private final List<Integer> list;

    public Listing(Collection<Integer> data) {
        list = new ArrayList<>(data);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ListIterator(list);
    }
}
