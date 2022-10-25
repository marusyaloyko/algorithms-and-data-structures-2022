package ru.mirea.workfourteen.task7;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите пароль: ");
        String str = in.nextLine();
        if (str.length() < 8) {
            System.out.println("пароль должен состоять из 8 и более символов");
        }

        for (int i = 0; i < str.length(); i++) {


        }

    }
}
