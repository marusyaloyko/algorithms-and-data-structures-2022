package ru.mirea.practice.task1;

public abstract class TriangularSequence {

    public static String recursion(int n) {
        int sum = 0;
        int j = 0;
        if (n == 1) {
            System.out.println("1");
        } else {
            for (int i = 1; sum < n; i++) {
                sum += i;
                j = i;
            }
            System.out.println(recursion(--n) + j);

        }
        return "";
    }

    public static void main(String[] args) {
        recursion(10);
    }
}
