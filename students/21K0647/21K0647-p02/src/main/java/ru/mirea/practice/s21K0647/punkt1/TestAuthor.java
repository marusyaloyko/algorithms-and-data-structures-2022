package ru.mirea.practice.s21K0647.punkt1;


import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Scanner source = new Scanner(System.in);
        Author k1 = new Author(source.nextLine(), source.nextLine(), source.next().charAt(0));
        System.out.print(k1.toString());
    }
}
