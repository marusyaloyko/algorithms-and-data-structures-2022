package ru.mirea.practice.Task5;

public class Tester {
    public static void main(String[] args) {
        DogKennel dogKennel = new DogKennel();
        Dog Sharik = new Dog("Sharik", 18);
        Dog Bublik = new Dog("Bublik", 50);

        System.out.println("Человеческий возраст шарика " + Sharik.ageToHuman() + " месяцев");
        System.out.println("Возраст Бублика " + Bublik.getAge() + " месяцев");
        //Возраст в месяцах
        dogKennel.addDog(Sharik);
        dogKennel.addDog(Bublik);

        System.out.println(dogKennel);
    }

}
