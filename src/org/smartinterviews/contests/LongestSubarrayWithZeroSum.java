package org.smartinterviews.contests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithZeroSum {
    // O(N^2)
    private static int longestSubarrayWithZeroSumLength(int[] arr) {
        int max_length = 0;
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
            for (int j = i; j < arr.length; j++) {
                currSum += arr[j];
                if (currSum == 0) {
                    max_length = Math.max(max_length, j - i + 1);
                }
            }

        }
        return max_length;
    }

    // O(N)
    private static int longestSubarrayWithZeroSumLengthHashing(int[] arr) {
        Map<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int max_len = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] == 0 && max_len == 0) max_len = 1;
            if (sum == 0) max_len = i + 1;
            // check if this sum already there in hashmap
            Integer prev_i = hm.get(sum);
            // if sum is there in hashmap, then update max_length if required
            if (prev_i != null) max_len = Math.max(max_len, i - prev_i);
            else hm.put(sum, i);
        }
        return max_len;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            int arrSize = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] arr = new int[arrSize];
            for (int j = 0; j < arrSize; j++) {
                arr[j] = Integer.parseInt(input[j]);
            }
            int result = longestSubarrayWithZeroSumLengthHashing(arr);
            bw.write(result + "\n");
        }

        br.close();
        bw.close();
    }
}
