//Заполнить список десятью случайными числами.
//        Отсортировать список методом sort() и вывести его на экран.

package seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        getRandom3To10();
    }

    static void getRandom3To10() {
        Random random = new Random();
        ArrayList<Integer> tenNums = new ArrayList<>();
        for (int i = 0; i < 100; i++) {

            tenNums.add(random.nextInt(3, 11));

        }
//        tenNums.sort(Comparator.naturalOrder());
        Collections.sort(tenNums, Comparator.naturalOrder());
        System.out.println(tenNums);

    }
}