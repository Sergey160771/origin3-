//Реализовать консольное приложение, которое:
//        Принимает от пользователя строку вида
//        text~num
//        Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//        Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

package seminar4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();

        String inputLine = "";
        Scanner lineScanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите строку вида text~num:");
            try {
                inputLine = lineScanner.nextLine();
            } catch (Exception e) {
                System.out.print("Ошибка!");
                e.printStackTrace();
            }

            if (inputLine.equals("exit")) {
                break;
            } else if (inputLine.equals("print")) {
                System.out.println(inputLine);
            } else if (inputLine.equals("revert")) {
                linkedList.remove(0);
            } else {
                linkedList.add(0, inputLine);
            }

            System.out.println(linkedList);
        }
    }
}