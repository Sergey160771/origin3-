//Напишите метод, который сжимает строку.
//        Пример: вход aaaabbbcdd.

package seminar2;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args)
    {
        ex3();
    }

    private static void ex3() {
        Scanner lineScanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String line = lineScanner.next();
        lineScanner.close();

        StringBuilder zippedLine = new StringBuilder();
        char prevChar = ' ';
        int quantity = 1;
        for (int i = 0; i < line.length(); i++) {
            char curChar = line.charAt(i);
            if (curChar == prevChar) {
                quantity++;
            } else {
                if (prevChar != ' ') {
                    zippedLine.append(prevChar);
                    if (quantity != 1) {
                        zippedLine.append(quantity);
                    }
                }
                quantity = 1;
                prevChar = curChar;
            }
        }
        zippedLine.append(prevChar);
        if (quantity != 1) {
            zippedLine.append(quantity);
        }
        System.out.println(zippedLine);
    }
}
