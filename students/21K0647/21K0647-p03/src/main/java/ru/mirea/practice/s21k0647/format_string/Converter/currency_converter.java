package ru.mirea.practice.s21k0647.format_string.Converter;

import java.text.NumberFormat;
import java.util.Locale;

public class currency_converter{
    String s;
    String from;
    String inlang;
    String inland;
    String course;

    currency_converter(String s, String from, String inlang, String inland, String cource) {
        this.s = s;
        this.from = from;
        this.inlang = inlang;
        this.inland = inland;
        this.course = cource;
    }

    public String Formated() {
        double n = Double.parseDouble(s);
        Locale.setDefault(new Locale(inlang, inland));
        double n1 = Double.parseDouble(course);
        n = n * n1;
        NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance();
        return numberFormat1.format(n);
    }



    public String toString() {
        return "Translation " + s + "\nfrom " + from + " in " + inlang +"\nOutput " + Formated();
    }

}
