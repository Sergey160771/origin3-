package seminar3;

import java.util.*;
import java.util.ArrayList;
import java.util.Random;


public class Task2 {
    public static void main(String[] args) {
        ex2();

    }

    private static void ex2() {
        List<String> planets = new ArrayList<>();
        HashMap<String, Integer> planetCount = new HashMap<>();
        Random rand = new Random();

        String[] solarSystemPlanets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        for (int i = 0; i < 10; i++) {
            int randIndex = rand.nextInt(solarSystemPlanets.length);
            planets.add(solarSystemPlanets[randIndex]);
        }

        planets.add("Pluto");
        planets.add("Pluto");
        planets.add("Pluto");
        planets.add("Pluto");

/*        for (String planet : planets) {
            System.out.printf("%s\t%s", planet, Collections.frequency(planets, planet));
        }*/

        for (String planet : planets) {
            if (planetCount.containsKey(planet)) {
                planetCount.put(planet, planetCount.get(planet) + 1);
            } else {
                planetCount.put(planet, 1);
            }
        }

        for (String planet : planetCount.keySet()) {
            System.out.printf("%s\t%s%n", planet, planetCount.get(planet));
        }

        planets.retainAll(Arrays.asList(solarSystemPlanets));
        System.out.println(planets);
    }
}


