package ru.mirea.practice.work1to5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Николаенко");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2022);
        cal.set(Calendar.MONTH, Calendar.SEPTEMBER);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        System.out.println("Задание получено: " + sdf.format(cal.getTime()));

        Date now = new Date();
        System.out.println("Задание сдано: " + now);

        if (now.compareTo(cal.getTime()) == 0) {
            System.out.println("Время одинаковое");
        } else if (now.compareTo(cal.getTime()) > 0) {
            System.out.println("Введённая дата больше");
        } else {
            System.out.println("Введённая дата меньше");
        }

        Scanner in = new Scanner(System.in);
        System.out.print("Input year: ");
        int year = in.nextInt();
        cal.set(Calendar.YEAR, year);

        System.out.print("Input month: ");
        int month = in.nextInt();
        cal.set(Calendar.MONTH, month);

        System.out.print("Input day: ");
        int day = in.nextInt();
        cal.set(Calendar.DAY_OF_MONTH, day);

        System.out.println("Calendar: " + sdf.format(cal.getTime()));

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println(estimatedTime);
    }
}
