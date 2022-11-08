package ru.mirea.workfourone.task6;

public class Tester {
    public static void main(String[] args) {
        Employer arr[] = new Employer[2];
        arr[0] = new Employer("1","1", 123);
        arr[1] = new Manager("2","2", 432, 320);
        System.out.println(arr[0].getIncome(12));
        System.out.println(arr[1].getIncome(12));
    }
}
