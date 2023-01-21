//Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

package Homework1;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        moveThreeEnd();
    }

    private static void moveThreeEnd() {
        int[] array = new int[50];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 4);
        }
        System.out.println(Arrays.toString(array));
        int val = 3;
        int left = 0;
        int right = array.length - 1;
        int temp = 0;
        while (left <= right) {
            if (array[left] == val && array[right] != val) {
                array[left] = array[right];
                array[right] = val;
                right--;
                left++;
            }
            if (array[right] == val) {
                right--;
            }
            if (array[left] != val) {
                left++;
            }
            if (array[left] == val && array[right] == val) {
                right--;
                left++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}


