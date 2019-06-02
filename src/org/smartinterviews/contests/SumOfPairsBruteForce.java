package org.smartinterviews.contests;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumOfPairsBruteForce {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for(int i=0; i<tc; i++) {
            String[] sizeOfArrayAndK = br.readLine().split(" ");
            int arrSize = Integer.parseInt(sizeOfArrayAndK[0]);
            int k = Integer.parseInt(sizeOfArrayAndK[1]);
            int[] inpArr = new int[arrSize];
            String[] inpStr = br.readLine().split(" ");
            for(int j=0; j<arrSize; j++) {
                inpArr[j] = Integer.parseInt(inpStr[j]);
            }
            String result = sumOfPairs(inpArr, k);
            System.out.println(result);
        }
    }
    
    public static String sumOfPairs(int[] arr, int k) {
        // System.out.println("Array : " + Arrays.toString(arr));
        // System.out.println("K : " + k);
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] + arr[j] == k)
                    return "True";
            }
        }
        return "False";
    }
    
}