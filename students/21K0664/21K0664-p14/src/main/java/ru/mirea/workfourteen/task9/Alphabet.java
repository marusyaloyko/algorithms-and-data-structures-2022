package ru.mirea.workfourteen.task9;

public abstract class Alphabet {
    public static void Alpha(String str) {
        str = str.toLowerCase();

        int[] result = new int['z' - 'a' + 1];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result[ch - 'a']++;
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println((char) (i + 'a') + " = " + result[i]);
        }
    }

    public static void main(String[] args) {
        Alpha("Hello World!");
    }
}
