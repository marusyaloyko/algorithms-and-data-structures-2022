package javvaeleven.task1;

import java.util.Date;
import java.util.Scanner;

public class Test {

    static String Fio() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ФИО ");
        String fio = in.nextLine();
        System.out.println("Ваше ФИО " + fio);
        return fio;
    }

    static Date DateStart() {
        Date DateStart = new Date();
        DateStart.getDate();
        System.out.println("Дата начала задания " + DateStart);
        return DateStart;
    }

    static Date DateFinsh() {
        Date DateFinsh = new Date();
        Long time = DateFinsh.getTime();
        long anotherDate = +7;
        time = time + (60 * 60 * 24 * 1000 * anotherDate);
        DateFinsh = new Date(time);
        System.out.println("Дата конца задания " + DateFinsh);
        return DateFinsh;
    }
    public static void main(String[] args) {
        Fio();
        DateStart();
        DateFinsh();


    }
}


