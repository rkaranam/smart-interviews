package org.hackerrank.datastructures.arrays;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// TODO
public class ArrayManipulation {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int arrSize = Integer.parseInt(inputs[0]);
        int operations = Integer.parseInt(inputs[1]);

        int[] arr = new int[arrSize];

        Arrays.fill(arr, 0);

        for (int i = 0; i < operations; i++) {
            String[] oprStr = br.readLine().split(" ");
            int a = Integer.parseInt(oprStr[0]);
            int b = Integer.parseInt(oprStr[1]);
            int value = Integer.parseInt(oprStr[2]);
            placeValueInIndexes(arr, a, b, value);
        }

        manipulativeArray(arr);

        // System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        bw.write(arr[arr.length - 1] + "\n");

        br.close();
        bw.close();

    }

    private static void manipulativeArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i-1];
        }
    }

    private static void placeValueInIndexes(int[] arr, int a, int b, int value) {
        arr[a - 1] += value;
        if(arr.length != b) arr[b] += -1 * value;
        // Arrays.stream(arr).forEach(System.out::println);
    }

}
