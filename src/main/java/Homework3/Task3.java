//Пройти по списку из задания 2 с урока и удалить повторяющиеся элементы.(способ 1)

package Homework3;

import java.util.ArrayList;
import java.util.Random;

import static java.util.stream.Collectors.toList;

public class Task3 {
    public static void main(String[] args) {
        String[] solarSystemPlanets={"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        RemoveDuplicateElements (solarSystemPlanets);
    }

    private static void RemoveDuplicateElements(String[] solarSystemPlanets) {
        ArrayList<String> planets=new ArrayList<> ();
        Random rand=new Random ();
        for (int i=0; i < 20; i++) {
            int randIndex=rand.nextInt (solarSystemPlanets.length);
            planets.add (solarSystemPlanets[randIndex]);
        }
        System.out.println (planets);

//        planets= (ArrayList<String>) planets.stream().distinct().collect(Collectors.toList());
        planets=(ArrayList<String>) planets.stream ().distinct ().collect (toList ());
        System.out.println (planets);
    }
}
