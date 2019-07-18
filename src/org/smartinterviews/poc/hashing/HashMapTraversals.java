package org.smartinterviews.poc.hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTraversals {

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

        traverseThroughIterator(pointsTable);
        traverseThroughForEachLoop(pointsTable);
        traverseThroughJava8ForEachMethod(pointsTable);

    }

    private static void traverseThroughJava8ForEachMethod(Map<String, Integer> table) {
        System.out.println("\n**** Using Java 8 forEach Method ****");
        table.forEach((country, points) -> System.out.println(country + " : " + points));
    }

    private static void traverseThroughForEachLoop(Map<String, Integer> pointsTable) {
        System.out.println("\n**** Using For Each Loop ****");
        for (Map.Entry<String, Integer> country : pointsTable.entrySet()) {
            System.out.println(country);
        }
    }

    private static void traverseThroughIterator(Map<String, Integer> pointsTable) {
        System.out.println("\n**** Using Iterator ****");
        Iterator it = pointsTable.entrySet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
