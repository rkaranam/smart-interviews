package org.smartinterviews.poc;

import java.util.Arrays;

public class SumOfPairsMergeSortTwoPointers {

	public static void main(String[] args) {
		int[] arr = {-30, 15, 20, 10, -10, 18, 22, 54};
		mergeSort(arr, 0, arr.length-1);
		int k = -20;
		sumOfPairs(arr, k);
		System.out.println(Arrays.toString(arr));
	}

	private static void sumOfPairs(int[] arr, int k) {
		int p1 = 0, p2 = arr.length - 1;
		while(p1 != p2) {
			if(arr[p1] + arr[p2] == k) {
				System.out.println("True");
				return;
			}
			else if(arr[p1] + arr[p2] > k) {
				p2--;
			}
			else if(arr[p1] + arr[p2] < k) {
				p1++;
			}
		}
		return;
	}

	private static void mergeSort(int[] arr, int lo, int hi) {
		if(lo == hi) return;
		int mid = (lo + hi) / 2;
		mergeSort(arr, lo, mid);
		mergeSort(arr, mid+1, hi);
		merge(arr, lo, mid, hi);
	}

	private static void merge(int[] arr, int lo, int mid, int hi) {
		int temp[] = new int[hi-lo+1];
		int p1 = lo, p2 = mid+1, k=0;
		while(p1 <= mid && p2 <= hi) {
			if(arr[p1] < arr[p2]) {
				temp[k++] = arr[p1++];
			} else {
				temp[k++] = arr[p2++];
			}
		}
		while(p1 <= mid) temp[k++] = arr[p1++];
		while(p2 <= hi) temp[k++] = arr[p2++];
		for(int i = 0; i < k; i++) {
			arr[lo+i] = temp[i];
		}
	}

}
