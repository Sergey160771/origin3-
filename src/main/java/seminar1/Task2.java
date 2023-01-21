package seminar1;

import java.util.Random;
public class Task2 {
    public static void main(String[] args) {
        ex2();
    }


    private static void ex2() {
        int[] arr = new int[20];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) rnd.nextInt(0, 2);
        }

        int chet = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                chet++;
            } else {
                if (max == 0 || chet > max) {
                    max = chet;
                }
                chet = 0;
            }
        }
        if (chet > max) max = chet;

        for (Integer arrg : arr) {
            System.out.print(arrg);
        }
        System.out.println();
        System.out.println(max);

        for (int i = 0; i < max; i++) {
            System.out.print(1);
        }
    }
}