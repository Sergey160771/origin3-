//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
package Homework5;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        ImplementingPhoneBook ();
    }

    private static void ImplementingPhoneBook() {
        Scanner Scanner=new Scanner (System.in);
        System.out.print ("Введите фамилию: ");
        String surname=Scanner.nextLine ();
        Scanner.close ();

        HashMap<String, List<String>> phoneBook=new HashMap<> ();

        phoneBook.put ("Иванов", List.of ("+7(111)111-111-111", "+7(222)222-222-2225 "));
        phoneBook.put ("Петров", List.of ("+7(333)333-333-333", "+7(444)444-444-444"));
        phoneBook.put ("Сидоров", List.of ("+7(555)555-555-555", "+7(666)666-666-666"));
        phoneBook.put ("Васильев", List.of ("+7(777)777-777-777", "+7(888)888-888-888"));
        phoneBook.put ("Попов", List.of ("+7(999)999-999-999", "+7(000)000-000-000"));
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}
