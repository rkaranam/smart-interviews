package org.smartinterviews.poc.hashing;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CheckArrayIsSubsetOfAnother {

    public static void main(String[] args) {

        int[] arrA = new int[]{23, 34, 64, 1, -43, 60, 5, 60};
        int[] arrB = new int[]{5, 23, 1, -43, 11};

        boolean result = isArraySubsetOfAnotherArray(arrA, arrB);
        System.out.println(result);

    }

    private static boolean isArraySubsetOfAnotherArray(int[] arrA, int[] arrB) {
        boolean result = true;

        // push array A into a HashSet
        Set<Integer> setA = new HashSet<>();
        for (Integer ele : arrA) {
            setA.add(ele);
        }
        System.out.println(setA.toString());

        // push array B into a HashSet
        Set<Integer> setB = new HashSet<>();
        for (Integer ele : arrB) {
            setB.add(ele);
        }
        System.out.println(setB.toString());

        Iterator iter = setB.iterator();

        while(iter.hasNext()) {
            if(!setA.contains(iter.next())) {
                result = false;
                break;
            }
        }

        return result;
    }

}
