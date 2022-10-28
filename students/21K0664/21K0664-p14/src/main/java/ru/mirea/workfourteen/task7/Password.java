package ru.mirea.workfourteen.task7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Password {
    private static final String PASSWORD_REGEX = "((?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$)";

    private static Pattern pattern;

    public Password() {
        pattern = Pattern.compile(PASSWORD_REGEX, Pattern.CASE_INSENSITIVE);
    }

    public static boolean validatePassword(String password) {
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(Password.validatePassword("F032_Password"));
        System.out.println(Password.validatePassword("TrySpy_1"));
        System.out.println(Password.validatePassword("smart_pass"));
        System.out.println(Password.validatePassword("A007"));
    }
}
