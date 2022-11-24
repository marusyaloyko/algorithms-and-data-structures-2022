package ru.mirea.practice.Task8;

abstract class Main {
    public static void main(String[] args) {
        String temp = "";
        String[] arr = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
