package ru.mirea.practice7.s0000009;
import java.util.ArrayList;
public class BookShelf
{
    private ArrayList<Book> books = new ArrayList<>();
    private int booksonshelf;
    public Book MaxPublYear(BookShelf obj)
    {
        int max = 0;
        Book maxb = new Book();
        for (Book i: obj.getBooks()) {
            if(i.getYearpublish() > max) {
                max = i.getYearpublish();
                maxb = i;
            }
        }
        System.out.print("Самый поздний срок издания у книги: ");
        return maxb;
    }
    public Book MinPublYear(BookShelf obj)
    {
        int min = 1000000;
        Book minb = new Book();
        for (Book i: obj.getBooks()) {
            if(i.getYearpublish() < min) {
                min = i.getYearpublish();
                minb = i;
            }
        }
        System.out.print("Самый ранний срок издания у книги: ");
        return minb;
    }
    public BookShelf Sort(BookShelf obj,int colbooks)
    {
        for (int i = 0;i<colbooks;i++){
            for(int j = i;j<colbooks-i-1;j++)
            {
                if(obj.getBooks().get(j).getYearpublish()>obj.getBooks().get(j+1).getYearpublish())
                {
                    Book k = obj.getBooks().get(j);
                    obj.getBooks().add(k);
                    obj.getBooks().set(j,obj.getBooks().get(j+1));
                    obj.getBooks().set(j+1, obj.getBooks().get(books.indexOf(k)));
                    obj.getBooks().remove(k);
                }
            }
        }
        return obj;
    }
    public BookShelf(int booksonshelf)
    {
        this.booksonshelf = booksonshelf;
    }
    public BookShelf(){}
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooksonshelf(int booksonshelf) {
        this.booksonshelf = booksonshelf;
    }

    public int getBooksonshelf() {
        return booksonshelf;
    }

}
