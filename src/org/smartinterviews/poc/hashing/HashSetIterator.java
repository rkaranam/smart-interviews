package org.smartinterviews.poc.hashing;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Syntax: Iterator iterate_value = Hash_Set.iterator();
 */

public class HashSetIterator {

    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();
        hs.add("Welcome");
        hs.add("to");
        hs.add("Geeks");
        hs.add("for");
        hs.add("Geeks");
        hs.add("Yorker");
        hs.add(null);

        System.out.println("HashSet: " + hs + "\n");

        System.out.println("Printing HashSet:");

        Iterator iter = hs.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }

}
