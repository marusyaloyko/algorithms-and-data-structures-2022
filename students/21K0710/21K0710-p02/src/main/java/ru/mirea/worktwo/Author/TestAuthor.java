package ru.mirea.worktwo.Author;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Author a = new Author("None", "None@example.com", 'm');
        Scanner source = new Scanner(System.in);
        System.out.println("Имя: " + a.getName());
        System.out.println("Введите почту");
        String f;
        f = source.next();
        a.setEmail(f);
        System.out.println("Почта: " + a.getEmail());
        System.out.println("Пол: " + a.getGender());
    }

}
