//Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)

package Homework3;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        RemovingFromListEvenNumbers();
    }
    private static void RemovingFromListEvenNumbers() {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {

            list.add(random.nextInt(0, 100));
        }
        System.out.println(list);
        list.removeIf(num -> num % 2 == 0);
        System.out.println(list);
    }

}

