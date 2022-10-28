package ru.mirea.practice.work1to5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
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
    }
}
