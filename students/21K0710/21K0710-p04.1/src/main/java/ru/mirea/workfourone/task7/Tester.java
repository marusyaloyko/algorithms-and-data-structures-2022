package ru.mirea.workfourone.task7;

public class Tester {
    public static void main(String[] args) {
        Learner arr[] = new Learner[4];
        arr[0] = new Student("1", "1", 1, "1", "1");
        arr[1] = new Student("2", "2", 2, "2", "2");
        arr[2] = new Schoolboy("3", "3", 3, "3");
        arr[3] = new Schoolboy("4", "4", 4, "4");
        System.out.println("Школьники в базе:");
        for (Learner learner : arr) {
            if (learner.getClass() == Schoolboy.class) {
                System.out.println(learner);
            }
        }
        System.out.println("Студенты в базе:");
        for (int i=0; i<arr.length; i++){
            if (arr[i].getClass() == Student.class){
                System.out.println(arr[i]);
            }
        }
    }
}
