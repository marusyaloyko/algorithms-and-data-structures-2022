package ru.mirea.practice.work1;

public class TestAuthor {
    public static void main(String[] args) {
        Author Andrew = new Author("Андрей", "Andrew@9509529898.ru", 'м');

        System.out.println(Andrew);
        System.out.println(Andrew.getName());
        System.out.println(Andrew.getEmail());
        System.out.println(Andrew.getGender());
        Andrew.setEmail("Andrew@jji.ru");
    }
}
