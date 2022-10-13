package ru.mirea.practice7.s0000009;

import java.util.Scanner;

public class BookTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int j = 0;
        do {
            System.out.println("Введите кол-во книг на полке");
            if (sc.hasNextInt())
            {
                j = sc.nextInt(); //считывает целое число из поток ввода и сохраняет в переменную
            }
        } while(j < 0);
        BookShelf mas = new BookShelf();

        for (int i = 0; i<j; i++)
        {
            String name;
            int yearpubl;
            System.out.println("Введите название книги:");
            name = sc.next();
            System.out.println("Введите год публикации книги:");
            yearpubl = sc.nextInt();
            Book t = new Book(name,yearpubl);
            mas.getBooks().add(t);
        }
        for (Book k: mas.getBooks())
        {
            System.out.println(k.getName() + " " + k.getYearpublish());
        }
        System.out.println(mas.MaxPublYear(mas).getName());
        System.out.println(mas.MinPublYear(mas).getName());
        mas.Sort(mas,j);
        for (Book k: mas.getBooks()){
            System.out.println(k.getName() + " " + k.getYearpublish());
        }


    }
}
