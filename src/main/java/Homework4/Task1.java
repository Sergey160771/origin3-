//Реализовать консольное приложение, которое:
//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.

package Homework4;

import java.util.Scanner;
import java.util.Stack;

public class Task1 {
    public static void main(String[] args)
    {
        printRevert();
    }

    private static void printRevert() {
        Scanner in = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        String str = "";
        
        do {
            System.out.println ("Введите строку или команду (print, exit, revert):");
            str = in.next();
            if (!str.equals("print") && !str.equals("revert") && !str.equals("exit")) {
                stack.push(str);
            } else if (str.equals("print")) { //если а = print
                for (int i = stack.size() - 1; i >= 0; i--) {
                    System.out.println(stack.elementAt(i));
                }
            } else if (str.equals("revert")) {
                stack.pop();
                System.out.println(stack);
            }
        } while (!str.equals("exit"));
        System.out.println(stack);
    }
}
