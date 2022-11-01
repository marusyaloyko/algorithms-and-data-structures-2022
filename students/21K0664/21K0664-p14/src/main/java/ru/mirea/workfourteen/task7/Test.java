package ru.mirea.workfourteen.task7;

import java.util.Arrays;

abstract class Test {

    public static void main(String[] args) {
        for (String s : Arrays.asList("F032_Password", "TrySpy_1", "smart_pass", "A007")) {
            System.out.println(Password.validatePassword(s));
        }
    }
}
