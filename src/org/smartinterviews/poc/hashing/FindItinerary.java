package org.smartinterviews.poc.hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * Input:
 * "Chennai" -> "Banglore"
 * "Bombay" -> "Delhi"
 * "Goa"    -> "Chennai"
 * "Delhi"  -> "Goa"
 * <p>
 * Output:
 * Bombay->Delhi, Delhi->Goa, Goa->Chennai, Chennai->Banglore
 */

public class FindItinerary {

    public static void main(String[] args) {

        Map<String, String> dataset = new HashMap<>();
        dataset.put("Chennai", "Banglore");
        dataset.put("Bombay", "Delhi");
        dataset.put("Goa", "Chennai");
        dataset.put("Delhi", "Goa");

        printItinerary(dataset);

    }

    private static void printItinerary(Map<String, String> dataset) {
        Map<String, String> reverseMap = new HashMap<>();

        for (Map.Entry<String, String> entry : dataset.entrySet()) {
            reverseMap.put(entry.getValue(), entry.getKey());
        }

        String startPoint = null;

        // Find starting point of itinerary
        for (Map.Entry<String, String> entry : dataset.entrySet()) {
            if (!reverseMap.containsKey(entry.getKey())) {
                startPoint = entry.getKey();
                break;
            }
        }

        // When starting point is not found, invalid input
        if (startPoint == null) {
            System.out.println("Invalid Input!!");
            return;
        }

        String endPoint = dataset.get(startPoint);

        while (endPoint != null) {
            System.out.println(startPoint + " -> " + endPoint);
            startPoint = endPoint;
            endPoint = dataset.get(startPoint);
        }
    }
}
