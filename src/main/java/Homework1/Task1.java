//Задать одномерный массив и найти в нем минимальный и максимальный элементы
package Homework1;


import java.util.Arrays;
import java.util.Random;
public class Task1 {
    public static void main(String[] args) {
        ElementMinMax();
    }

    private static void ElementMinMax() {

        int[] array = new int[100];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        int minElement = array[0];
        int maxElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.printf("Минимальный элемент равен %s%n", minElement);
        System.out.printf("Максимальный элемент равен %s%n", maxElement);
    }
}
