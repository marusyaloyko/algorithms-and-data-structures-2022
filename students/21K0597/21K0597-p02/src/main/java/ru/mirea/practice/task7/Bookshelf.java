package ru.mirea.practice.task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bookshelf {
    private final List<Book> shelf;

    public Bookshelf() {
        shelf = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        shelf.add(book);
    }

    public Book getOldest() {
        int temp = 99999999;
        int k = 0;
        for (int i = 0; i < shelf.size(); i++) {
            if (shelf.get(i).getWritingYear() < temp) {
                temp = shelf.get(i).getWritingYear();
                k = i;
            }
        }
        return shelf.get(k);
    }

    public Book getYoungest() {
        int temp = 0;
        int k = 0;
        for (int i = 0; i < shelf.size(); i++) {
            if (shelf.get(i).getWritingYear() > temp) {
                temp = shelf.get(i).getWritingYear();
                k = i;
            }
        }
        return shelf.get(k);
    }

    public void bookSort() {
        Collections.sort(shelf, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getWritingYear() - o2.getWritingYear();
            }
        });
    }

    public void show() {
        for (int i = 0; i < shelf.size(); i++) {
            System.out.println(i + " " + shelf.get(i).toString());
        }
    }
}
