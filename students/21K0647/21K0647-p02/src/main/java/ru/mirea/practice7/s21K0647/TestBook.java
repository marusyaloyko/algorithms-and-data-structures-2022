package ru.mirea.practice7.s21K0647;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Tolstoy", "Anna Karenina", 1873);
        Book b2= new Book("Hemenguei", "for whom the bell tolls", 1940);
        Book b3= new Book("Pushkin", "Eugene Onegin", 1831);
        Bookshelf Shelf = new Bookshelf(3);
        Shelf.Bookshelf_add(b1);
        Shelf.Bookshelf_add(b2);
        Shelf.Bookshelf_add(b3);
        System.out.println(Shelf.old());
        System.out.println(Shelf.young());
    }
}
