package ru.mirea.practice5.s0000009;

public class Tester
{
    public static void main(String[] args)
    {
        Dog obj1 = new Dog("Barbos",5);
        Dog obj2 = new Dog("Sharik",7);
        System.out.println(obj1.getHumanAgeDog());
        System.out.println(obj1);
        DogsHouse c1 = new DogsHouse();
        c1.getDogs().add(obj1);
        c1.getDogs().add(obj2);
        System.out.println(c1.getDogs());
    }
}
