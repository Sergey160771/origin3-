//Написать метод, который определяет, является ли год високосным, и возвращает boolean
//(високосный - true, не високосный - false).
//Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

package Homework1;

import java.util.Scanner;


import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(leapYear());
    }

    private static boolean leapYear() {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = Scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

