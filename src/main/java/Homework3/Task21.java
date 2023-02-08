//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
package Homework3;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.Random;

public class Task21 {
    public static void main(String[] args) {
        FindMinMaxAverage ();
    }
    private static void FindMinMaxAverage() {
        Random random=new Random ();
        ArrayList<Integer> list=new ArrayList<> ();
        for (int i=0; i < 100; i++) {
            list.add (random.nextInt (-100, 100));
        }
        IntSummaryStatistics stats=new IntSummaryStatistics ();
        for (int num : list) {
            stats.accept (num);
        }
        System.out.println (list);
        System.out.printf ("Минимальный элемент равен %d%n", stats.getMin ());
        System.out.printf ("Максимальный элемент равен %d%n ", stats.getMax ());
        System.out.printf ("Среднее арифметическое равно %.2f", stats.getAverage ());
    }
}