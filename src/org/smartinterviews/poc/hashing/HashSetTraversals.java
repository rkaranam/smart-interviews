package org.smartinterviews.poc.hashing;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTraversals {

    public static void main(String[] args) {

        Set<String> metroCities = new HashSet<String>();
        metroCities.add("Hyderabad");
        metroCities.add("New Delhi");
        metroCities.add("Chennai");
        metroCities.add("Banglore");
        metroCities.add("Kolkata");
        metroCities.add("Chennai");

        traverseThroughIterator(metroCities);
        traverseThroughForEachLoop(metroCities);
        traverseThroughJava8ForeachMethod(metroCities);

    }

    private static void traverseThroughJava8ForeachMethod(Set<String> metroCities) {
        System.out.println("\n**** Using Java 8 forEach Method ****");
        metroCities.forEach(city -> System.out.println(city));
    }

    private static void traverseThroughForEachLoop(Set<String> metroCities) {
        System.out.println("\n**** Using For Each Loop ****");
        for (String city : metroCities) {
            System.out.println(city);
        }
    }

    private static void traverseThroughIterator(Set<String> metroCities) {
        System.out.println("\n**** Using Iterator ****");
        Iterator it = metroCities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
