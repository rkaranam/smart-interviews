package org.hackerrank.algorithms;

import java.util.Arrays;

public class MinMaxSum {

	public static void main(String[] args) {
		int[] arr = {0, 54, -12, 23, 4};
		minMaxSum(arr);
	}

	private static void minMaxSum(int[] arr) {
		Arrays.sort(arr);
		// int minSum = 0, maxSum = 0; 
		// Changed int to long as variable
		// as variable overflows for large values of arr elements
		long minSum = 0, maxSum = 0; 
		for(int i=0; i<4; i++) {
			minSum += arr[i];
		}
		for(int j=arr.length-1; j>(arr.length-1-4); j--) {
			maxSum += arr[j];
		}
		System.out.println(minSum + " " + maxSum);
	}

}
