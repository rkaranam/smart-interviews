package org.smartinterviews.contests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class FindingMissingNumber {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());

        for(int i = 0; i < tc; i++) {
            int arrSize = Integer.parseInt(br.readLine());
            int[] arr = new int[arrSize];
            String[] eleStr = br.readLine().split(" ");
            for(int j = 0; j < arrSize; j++) {
                arr[j] = Integer.parseInt(eleStr[j]);
            }
            int result = findMissingNumber(arr, arrSize);
            bw.write(result + "\n");
        }

        br.close();
        bw.close();
    }

    private static int findMissingNumber(int[] arr, int arrSize) {
        int expectedSum = ((arrSize + 1)*(arrSize + 2)) / 2;
        int actualSum = Arrays.stream(arr).sum();
        return expectedSum - actualSum;
    }

}
