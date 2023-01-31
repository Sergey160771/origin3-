//1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
//2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.

package seminar4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
public class Task0 {
    public static void main(String[] args) {
        int LIST_SIZE = 1000000;

        List<Random> linkedList = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < LIST_SIZE; i++) {
            linkedList.add(0, new Random());
        }
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start));


        List<Random> arrayList = new ArrayList<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < LIST_SIZE; i++) {
            arrayList.add(0, new Random());
        }
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start));
    }
}
