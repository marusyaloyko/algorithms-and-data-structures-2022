package ru.mirea.practice.work2;

abstract class MapTest {
    public static void main(String[] args) {
        Maping<String, String> maping = new Maping<>();
        maping.createMap();
        System.out.println(maping.getSameFirstNameCount());
    }
}
