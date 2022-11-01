package ru.mirea.workfourteen.task7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract class Password {

    private Pattern pattern;

    public Password() {
        pattern = Pattern.compile("((?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$)", Pattern.CASE_INSENSITIVE);
    }

    public static boolean validatePassword(String password) {
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

}
