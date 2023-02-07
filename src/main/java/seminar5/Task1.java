//Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
//        321456 Васильев
//        234561 Петрова
//        234432 Иванов
//        654321 Петрова
//        345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.

package seminar5;

import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {
        GetEemployeeData ();
    }

    private static void GetEemployeeData() {
        HashMap<Integer, String> people=new HashMap<> ();
        people.put (123456, "Иванов");
        people.put (234561, "Петрова");
        people.put (234432, "Иванов");
        people.put (654321, "Петрова");
        people.put (345678, "Иванов");

        for (Integer key : people.keySet ()) {
            if ("Иванов".equals (people.get (key))) {
                System.out.printf ("[%d:%s]\n", key, people.get (key));
            }
        }
    }
}
