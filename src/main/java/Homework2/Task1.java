//Напишите метод, который принимает на вход строку (String) и
//определяет является ли строка палиндромом (возвращает boolean значение).

package Homework2;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
       System.out.println(CheckStringPalindrome());

    }
    private static boolean CheckStringPalindrome() {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = Scanner.nextLine();
        Scanner.close();
        String straight = str.replaceAll("\\s+", "").toLowerCase();
        String reverse = new StringBuilder(straight).reverse().toString();

        return straight.equals(reverse);

    }
}

