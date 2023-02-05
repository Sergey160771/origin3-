//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
package Homework4;

import java.util.LinkedList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args)
    {
        FlippingList();
    }

    private static void FlippingList() {
        Random random = new Random();
        LinkedList<String> linkList = new LinkedList<> ();
        for (int i = 0; i < 20; i++) {
           linkList.add(String.valueOf (random.nextInt(0, 11)));
        }
        System.out.println (linkList);
        int temp = 0;
        while (temp != linkList.size() - 1) {
            linkList.add(linkList.size()-temp, linkList.getFirst());
            linkList.removeFirst();
            temp++;
        }

        System.out.println (linkList);
    }
}
