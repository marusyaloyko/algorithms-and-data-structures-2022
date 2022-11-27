package ru.mirea.practice.n7;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(Factorial.Count(4));
    }
    static int Count(int n)
    {
        int ans = 1, i=2;
        while (i<=n)
        {
            ans*=i;
            i++;
        }
        return ans;
    }
}
