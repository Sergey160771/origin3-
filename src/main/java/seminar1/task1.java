package seminar1;

import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        ex1();
}
    private static void ex1() {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Имя: ");
        String name = Scanner.nextLine();
        System.out.printf("Привет, %s!%n", name);
        Scanner.close();
    }
}