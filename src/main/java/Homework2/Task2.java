//Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
//который запишет эту строку в простой текстовый файл, обработайте исключения.
package Homework2;

import java.io.FileOutputStream;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        RepeatsLineHundredTimes ();
        WriteResultFile ();
    }

    private static StringBuilder RepeatsLineHundredTimes() {
        int n=100;
        String str="TEST ";

        StringBuilder sb=new StringBuilder ();
        sb.append (str.repeat (n));
        System.out.println (sb);
        return sb;
    }

    private static void WriteResultFile() {
        try {
            FileOutputStream fileOutputStream=new FileOutputStream ("src//main/resources/lib/file1.txt");
            fileOutputStream.write (RepeatsLineHundredTimes ().toString ().getBytes ());
            fileOutputStream.close ();
        } catch (IOException e) {
            System.out.println ("Проблема вывода!");
            e.printStackTrace ();
        }
        finally {
            System.out.println("Окончание");
        }
    }
}
