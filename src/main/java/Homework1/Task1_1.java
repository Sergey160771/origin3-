package Homework1;

import java.util.Arrays;
import java.util.Random;


public class Task1_1 {
    public static void main(String[] args) {
        ElementMinMax();
    }

    private static void ElementMinMax() {


        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }

        int minElement = Integer.MAX_VALUE;
        int maxElement = Integer.MIN_VALUE;

        for (int item : array) {
            maxElement = Math.max(item, maxElement);
            minElement = Math.min(item, minElement);
        }
        System.out.println(Arrays.toString(array));
        System.out.printf("Минимальный элемент равен %s%n", minElement);
        System.out.printf("Максимальный элемент равен %s%n", maxElement);
    }

}



