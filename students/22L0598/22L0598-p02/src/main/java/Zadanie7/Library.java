package Zadanie7;

public class Library {
    private Book[] my_library = new Book[4];{
        my_library[0]=new Book("The Thorn Birds","Colleen McCullough",1977);
        my_library[1]=new Book("Gone with the Wind","Margaret Mitchel",1936);
        my_library[2]=new Book("The Idiot","Fedor Dostoevsky",1869);
        my_library[3]=new Book("White Fang","Jack London",1906);
    };

    public String getNewestBook(){
        int newest_book_year = 0;
        Book newest_book = new Book("itgelt", "morojenoe", 2022);

        for(int index=0; index<my_library.length;index++){
            if(my_library[index].publicationYear > newest_book_year ){
                newest_book_year = my_library[index].publicationYear;
                newest_book = my_library[index];
            }
        }

        return newest_book.nameBook;
    }
    public String getOldestBook() {
        int oldest_book_year = 2025;
        Book oldest_book = new Book("itgelt", "morojenoe", 2022);

        for (int index = 0; index < my_library.length; index++) {
            if (my_library[index].publicationYear < oldest_book_year) {
                oldest_book_year = my_library[index].publicationYear;
                oldest_book = my_library[index];
            }
        }

        return oldest_book.nameBook;
    }
}
