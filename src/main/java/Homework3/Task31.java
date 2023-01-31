//Пройти по списку из задания 2 с урока и удалить повторяющиеся элементы.(способ 2)
package Homework3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;
import java.util.Collections;

public class Task31 {
    public static void main(String[] args) {
        String[] solarSystemPlanets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        RemoveDuplicateElements(solarSystemPlanets);
    }
    private static void RemoveDuplicateElements(String[] solarSystemPlanets) {
        ArrayList<String> planets = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            int randIndex = rand.nextInt(solarSystemPlanets.length);
            planets.add(solarSystemPlanets[randIndex]);
        }
        System.out.println(planets);
        Iterator<String> iterator = planets.iterator();
        while (iterator.hasNext()) {
            if (Collections.frequency(planets, iterator.next()) > 1) {
                iterator.remove();
            }
        }
        System.out.println(planets);
    }
}