package Homework6;

import java.util.List;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {

        Laptop laptop1=new Laptop ("Lenovo", 4, 1000, 15.6,
                "grey", 111111, 55000);
        Laptop laptop2=new Laptop ("ASUS", 16, 128, 15.6,
                "black", 222222,47000);
        Laptop laptop3=new Laptop ("HP", 8, 1000, 13.3,
                "grey", 333333,75000);
        Laptop laptop4=new Laptop ("HP", 4, 500, 15.6,
                "black", 444444,50000);

        Scanner Scanner=new Scanner (System.in);
        System.out.print ("Введите цвет: ");
        String newColor=Scanner.nextLine ();
        Scanner.close ();

        List<Laptop> Listlaptop=List.of (laptop1, laptop2, laptop3, laptop4);
        for (Laptop laptop : Listlaptop) {
            if (laptop.getColor ().equals (newColor)) {
                laptop.printInfo ();
            }
        }
    }
}