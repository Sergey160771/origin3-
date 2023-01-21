package seminar1;

import java.lang.reflect.Array;
import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        ex3();
    }

    private static void ex3() {
        int[] binaryArray = new int[1000];
        int counter = 0;
        int maxLength = 0;
        Random random = new Random();
//        double randomFromMath = Math.random();
//        System.out.println(randomFromMath);

        for (int i = 0; i < binaryArray.length; i++) {
            binaryArray[i] = random.nextInt(2);
        }
        System.out.println(Arrays.toString(binaryArray));
        for (int num : binaryArray) {
            if (num == 1) {
                counter++;
            } else {
                /*if (counter > maxLength) {
                    maxLength = counter;
                    counter = 0;
                }*/

                //(условие) ? true : false;
//                maxLength = (counter > maxLength) ? counter : maxLength;

                maxLength = Math.max(counter, maxLength);
                counter = 0;
            }
        }

        System.out.println("max length: " + Math.max(counter, maxLength));

    }
}
