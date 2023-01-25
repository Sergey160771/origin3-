//Дано четное число N (>0) и символы c1 и c2.
//Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.(Способ-4)
package seminar2;

import java.util.Scanner;
public class Task14 {
    public static void main(String[] args) {
        Test2();
    }

    private static void Test2() {
        Scanner read = new Scanner(System.in);
        System.out.print("Введите длину строки: ");
        int length = read.nextInt();

        // Задаем первый символ
        read = new Scanner(System.in);
        System.out.print("Ведите символ C1: ");
        char first = read.next().charAt(0);

        // Задаем второй символ
        System.out.print("Ведите символ C2: ");
        char second = read.next().charAt(0);

        String firstStrSymbol = String.valueOf(first);

        String str = String.valueOf(first).concat(String.valueOf(second)).repeat(length / 2);
//        String str =
//                String.valueOf(first)
//                        .concat(String.valueOf(second))
//                        .repeat(length / 2)
//                        .concat((length % 2 == 1) ? String.valueOf(first) : "");

        if (length % 2 == 1) {
//            sb.append(first);
            str += String.valueOf(first);
        }
        System.out.println(str);
    }
}
