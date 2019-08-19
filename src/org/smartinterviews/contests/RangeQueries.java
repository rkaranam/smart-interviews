package org.smartinterviews.contests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class RangeQueries {
    private static int lowerIndex(int[] arr, int start) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= start) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private static int upperIndex(int[] arr, int end) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= end) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }

    private static int rangeQueries(int[] arr, int start, int end, int k) {
        int count;
        if (start > k) count = 0;
        else count = upperIndex(arr, end) - lowerIndex(arr, start) + 1;
        return count;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            String[] input = br.readLine().split(" ");
            int arrSize = Integer.parseInt(input[0]);
            int k = Integer.parseInt(input[1]);
            String[] arrElements = br.readLine().split(" ");
            int[] arr = new int[arrSize];
            for (int j = 0; j < arrSize; j++) {
                arr[j] = Integer.parseInt(arrElements[j]);
            }
            Arrays.sort(arr);
            int queries = Integer.parseInt(br.readLine());
            for (int j = 0; j < queries; j++) {
                String[] query = br.readLine().split(" ");
                int start = Integer.parseInt(query[0]);
                int end = Integer.parseInt(query[1]);
                int result = rangeQueries(arr, start, end, k);
                bw.write(result + "\n");
            }
            bw.write("End of Test Case : " + (i + 1) + "\n");
        }

        br.close();
        bw.close();
    }
}
