package ru.mirea.practice.form.task2;


abstract class ConvertorShop {

    public static double getEuroToDollar(double euro) {
        return euro * 1.04;
    }

    public static double getDollarToEuro(double dollar) {
        return dollar / 1.04;
    }

    public static double getEuroToRub(double euro) {
        return euro * 63.05;
    }

    public static double getRubToEuro(double dollar) {
        return dollar / 63.05;
    }

    public static double getDollarToRub(double dollar) {
        return dollar * 60.42;
    }

    public static double getRubToDollar(double dollar) {
        return dollar / 60.42;
    }


}