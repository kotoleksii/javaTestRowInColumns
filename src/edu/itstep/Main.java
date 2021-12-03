package edu.itstep;

public class Main {

    public static void main(String[] args) {
        final int COLUMN = 4;
        String[] strings = {"11111", "11111111",
                "11111111", "111", "11", "111",
                "1111", "1111111", "11111111",
                "1", "1", "11111111111", "1",
                "1111111111111111111", "111", "11111"};

        //підготовка масиву для виводу
        String[] formats = new String[COLUMN];

        for (int i = 0; i < COLUMN; i++) {
            int max = -1;
            for (int n = i; n < strings.length; n += COLUMN) {
                if (max < strings[n].length()) {
                    max = strings[n].length();
                }
            }
            formats[i] = "%-" + max + "s  ";
        }

        // вивід
        for (int i = 0; i < strings.length; i++) {
            String format = formats[i % COLUMN];
            System.out.printf(format, strings[i]);
            if ((i + 1) % COLUMN == 0) {
                System.out.println();
            }
        }
    }
}
