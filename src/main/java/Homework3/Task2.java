//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.

package Homework3;

import com.google.common.math.Stats;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        FindMinMaxAverage ();

    }

    private static void FindMinMaxAverage() {
        Random random=new Random ();
        ArrayList<Integer> list=new ArrayList<> ();
        for (int i=0; i < 100; i++) {
            list.add (random.nextInt (-100, 100));
        }

        System.out.println (list);
        int min=Collections.min (list);
        int max=Collections.max (list);
        double average=Stats.meanOf (list);
        System.out.printf ("Минимальный элемент равен %d%n", min);
        System.out.printf ("Максимальный элемент равен %d%n ", max);
        System.out.printf ("Среднее арифметическое равно %.2f", average);
    }
}
