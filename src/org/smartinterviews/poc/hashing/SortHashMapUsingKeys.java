package org.smartinterviews.poc.hashing;

import java.util.*;

public class SortHashMapUsingKeys {

    public static void main(String[] args) {

        Map<String, Integer> pointsTable = new HashMap<>();
        pointsTable.put("India", 15);
        pointsTable.put("Australia", 14);
        pointsTable.put("England", 12);
        pointsTable.put("New Zealand", 11);
        pointsTable.put("Pakistan", 11);
        pointsTable.put("Sri Lanka", 7);
        pointsTable.put("South Africa", 7);
        pointsTable.put("Bangladesh", 7);
        pointsTable.put("West Indies", 5);
        pointsTable.put("Afghanistan", 0);

        sortHashMapUsingKeysAndList(pointsTable);
        sortHashMapUsingKeysAndTreeMap(pointsTable);

    }

    private static void sortHashMapUsingKeysAndTreeMap(Map<String, Integer> pointsTable) {
        System.out.println("\n**** Sorting HashMap using Keys and TreeMap ****");

        TreeMap<String, Integer> sortedMap = new TreeMap<>(pointsTable); // Using TreeMap Constructor
        sortedMap.forEach((country, points) -> System.out.println(country + " :: " + points));

        System.out.println();

        TreeMap<String, Integer> treeMapUnsorted = new TreeMap<>();
        treeMapUnsorted.putAll(pointsTable); // Using TreeMap putAll to populate

        for (Map.Entry<String, Integer> entry : treeMapUnsorted.entrySet()) {
            System.out.println(entry.getKey() + " ::: " + entry.getValue());
        }
    }

    private static void sortHashMapUsingKeysAndList(Map<String, Integer> pointsTable) {
        System.out.println("\n**** Sorting HashMap using Keys and ArrayList ****");
        List<String> countries = new ArrayList<>(pointsTable.keySet());
        Collections.sort(countries);
        countries.forEach(country -> System.out.println(country + " : " + pointsTable.get(country)));
    }

}
