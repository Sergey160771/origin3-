package Homework5;



import java.util.stream.Collectors;
import java.util.*;
public class Task2 {
    public static void main(String[] args) {
        Map<String, Integer> nameMap=new HashMap<> ();
        String employees="Иван Иванов " +
                "Светлана Петрова " +
                "Кристина Белова " +
                "Анна Мусина " +
                "Анна Крутова " +
                "Иван Юрин " +
                "Петр Лыков " +
                "Павел Чернов " +
                "Петр Чернышов " +
                "Мария Федорова " +
                "Марина Светлова " +
                "Мария Савина " +
                "Мария Рыкова " +
                "Марина Лугова " +
                "Анна Владимирова " +
                "Иван Мечников " +
                "Петр Петин " +
                "Иван Ежов ";
        String[] listOfNamesAndSurnames=employees.split (" ");
        for (int i=0; i < listOfNamesAndSurnames.length; i+=2) {
            if (nameMap.containsKey (listOfNamesAndSurnames[i])) {
                nameMap.replace (listOfNamesAndSurnames[i], nameMap.get (listOfNamesAndSurnames[i]) + 1);
            } else {
                nameMap.put (listOfNamesAndSurnames[i], 1);
            }
        }
        System.out.println (nameMap);

        Map <String, Integer> sortedMap = nameMap.entrySet().stream()
                .sorted(Comparator.comparingInt(Map.Entry::getValue))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> { throw new AssertionError(); },
                        LinkedHashMap::new
                ));
        System.out.println (sortedMap);
    }
}

