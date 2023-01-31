package seminar4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Task12 {
    public static void main(String[] args) {
        ex1();
    }

    private static void ex1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку типа: text~num ");
        String str =scanner.nextLine();
        scanner.close();

//        str.replace(" ","");
        String[]words = str.split("~");
        int num = Integer.parseInt(words[1]);
        String text =words[0];

        List<String>linkedList = new LinkedList<>();
        for (int i=0; i<=num;i++) {
            linkedList.add("0");
        }
        System.out.println(linkedList);

        if (words[0].equals("print")){
            System.out.println(linkedList.get(num));
            linkedList.remove(num);
        }else {
            linkedList.add(num,words[0]);
        }
        System.out.println(linkedList);
    }
}
