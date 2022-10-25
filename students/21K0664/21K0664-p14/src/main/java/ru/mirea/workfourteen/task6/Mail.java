package ru.mirea.workfourteen.task6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mail {
    private static final String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

    private static Pattern pattern;

    public Mail() {
        pattern = Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE);
    }

    public static boolean validateEmail(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(Mail.validateEmail("root@localhost.ru"));
        System.out.println(Mail.validateEmail("user@example.com"));
        System.out.println(Mail.validateEmail("myhost@@@com.ru"));
        System.out.println(Mail.validateEmail("@my.ru"));

    }
}


