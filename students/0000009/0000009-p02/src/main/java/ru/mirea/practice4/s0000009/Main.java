package ru.mirea.practice4.s0000009;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        Shop obj1 = new Shop();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите компьютеры");
        String namecomp = sc.nextLine();
        while(!(namecomp.equals("Exit") | namecomp.equals("Выйти")) )
        {
            obj1.AddComp(obj1,namecomp);
            namecomp  = sc.nextLine();
        }
        System.out.println(obj1.SearchComp(obj1,"Intel")); // поиск по названию
        obj1.DeleteComp(obj1, 4); // удаление по индексу
        obj1.AddComp(obj1, "IBM");
        for (String name: obj1.getComputers())
        {
            System.out.println(name);
        }

    }
}
