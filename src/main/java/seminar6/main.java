package seminar6;

import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vasya","mael","Siberian",7,"Peter");
        Cat cat2 = new Cat("Lucy","female","Persian", 12,"Kolya");
        Cat cat3 = new Cat("Tishka","mael","Mongrel",3,"Olya");
        Cat cat4 = new Cat("Martin","male" , "Britan", 5,"Vasya");

        List<Cat>listCat = List.of (cat1,cat2,cat3,cat4);
        Scanner Scanner=new Scanner (System.in);
        System.out.print ("Введите породу: ");
        String myСat=Scanner.nextLine ();
        Scanner.close ();

        for (Cat cat:listCat){
            if (cat.getBreed ().equals (myСat))
                cat.printInfo ();
        }
    }
}
