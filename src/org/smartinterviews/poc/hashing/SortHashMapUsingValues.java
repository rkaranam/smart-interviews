package org.smartinterviews.poc.hashing;

import java.util.*;

public class SortHashMapUsingValues {

    public static void main(String[] args) {

        HashMap<String, Integer> studentMarks = new HashMap<>();

        studentMarks.put("Math", 98);
        studentMarks.put("Data Structures", 85);
        studentMarks.put("Databases", 91);
        studentMarks.put("Java", 95);
        studentMarks.put("Operating Systems", 79);
        studentMarks.put("Networking", 80);

        Map<String, Integer> sortedMapBasedOnSubjectMarks = sortByMarksInSubjects(studentMarks);

        for (Map.Entry<String, Integer> en : sortedMapBasedOnSubjectMarks.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                    ", Value = " + en.getValue());
        }

    }

    private static Map<String, Integer> sortByMarksInSubjects(HashMap<String, Integer> studentMarks) {

        // create list from elements of HashMap
        List<Map.Entry<String, Integer>> list = new LinkedList<>(studentMarks.entrySet());

        list.forEach(entry -> System.out.println(entry));

        System.out.println();

        Collections.sort(list, Comparator.comparingInt(Map.Entry::getValue));

        list.forEach(entry -> System.out.println(entry));

        System.out.println();

        return studentMarks;

    }

}
