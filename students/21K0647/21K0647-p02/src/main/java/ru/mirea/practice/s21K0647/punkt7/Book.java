package ru.mirea.practice.s21K0647.punkt7;

public class Book {
    String author;
    String title;
    int year;

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String getAuthor(){ return author;}

    public void setAuthor(String author){ this.author = author;}

    public String getTitle(){ return title;}

    public void setTitle(String title){ this.title = title;}

    public int getYear(){ return year;}

    public void setYear(int year){ this.year = year;}
}
