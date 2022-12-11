package ru.mirea.practice;

public class Zadanie5 {
    public static int getFactorial(int factorial) {
        int result = 1;
        for (int i =1; i <= factorial; i++){
            result = result * i;
        }
        return result;
    }

public static void main(String [] args){
        System.out.println(getFactorial(5));
     }
}
