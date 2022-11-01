package ru.mirea.workfourteen.task6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract class Mail {

    private static Pattern pattern;

    public Mail() {
        String emailregex = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        pattern = Pattern.compile(emailregex, Pattern.CASE_INSENSITIVE);
    }

    public static boolean validateEmail(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}


