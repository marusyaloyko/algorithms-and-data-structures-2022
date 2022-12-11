package Zadanie7;

public class Book  {
    public String nameBook;
    public String author;
    public int publicationYear;

    Book(String nameBook,String author,int publicationYear){
        this.nameBook=nameBook;
        this.author=author;
        this.publicationYear=publicationYear;
    }

    public Book getBook (){
        return this;
    }
}
