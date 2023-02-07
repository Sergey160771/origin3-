//1.Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
//2. Создайте метод, в который передайте заполненный выше массив и
// с помощью Set вычислите процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
//Для вычисления процента используйте формулу:
//процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

package seminar6;

import java.util.HashSet;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] result=createArr ();
        System.out.println ("процент уникальных чисел " + qwe (result));
    }

    private static Double qwe(int[] arr) {
        HashSet<Integer> set=new HashSet<> ();
        for (int i=0; i < arr.length; i++) {
            set.add (arr[i]);
        }
        return 1.0 * (set.size () * 100) / arr.length;
//        return (set.size () * 100.0) / arr.length;
    }

    private static int[] createArr() {
        int[] arr=new int[1000];
        Random rnd=new Random ();
        for (int i=0; i < arr.length; i++) {
            arr[i]=rnd.nextInt (0, 1000);
        }
        return arr;
    }
}

