package ru.mirea.practice.task7;

public class Book {
    public String author;
    public String booksName;
    public int writingYear;

    public Book(String author, String booksName, int writingYear) {
        this.author = author;
        this.booksName = booksName;
        this.writingYear = writingYear;
    }

    public Book() {
        this.author = "author";
        this.booksName = "booksname";
        this.writingYear = 0;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBooksname() {
        return booksName;
    }

    public void setBooksname(String booksname) {
        this.booksName = booksname;
    }

    public int getWritingYear() {
        return writingYear;
    }

    public void setWritingYear(int writingYear) {
        this.writingYear = writingYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", booksName='" + booksName + '\'' +
                ", writingYear=" + writingYear +
                '}';
    }
}