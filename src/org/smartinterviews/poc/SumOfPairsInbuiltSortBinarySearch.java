package org.smartinterviews.poc;

import java.util.Arrays;

public class SumOfPairsInbuiltSortBinarySearch {

	public static void main(String[] args) {
		int[] arr = { -30, 15, 20, 10, -10, 18, 22, 54 };
		int k = -10;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		sumOfPairs(arr, k);
	}

	private static void sumOfPairs(int[] arr, int k) {
		int lo = 0, hi = arr.length - 1;
		binarySearchIterative(arr, k);
		// binarySearchRecursive(arr, lo, hi, k);
	}
	
	private static void binarySearchIterative(int[] arr, int k) {
		int low = 0, high = arr.length -1, mid;
		
		while(low != high) {
			mid = (low + high) / 2;
			if(arr[mid] ==  k) {
				System.out.println("True");
				return;
			}
			else if(arr[mid] > k) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		
		return;
	}

	private static void binarySearchRecursive(int[] arr, int low, int high, int k) {
		// Base Condition
		if (low == high)
			return;

		// Main Logic
		int mid = (low + high) / 2;
		if (arr[mid] == k) {
			System.out.println("True");
			return;
		} else if (arr[mid] > k)
			binarySearchRecursive(arr, low, mid - 1, k);
		else
			binarySearchRecursive(arr, mid + 1, high, k);
	}

}
