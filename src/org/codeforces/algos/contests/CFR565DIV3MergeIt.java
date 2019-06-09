package org.codeforces.algos.contests;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// Result: WA - TODO
public class CFR565DIV3MergeIt {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());

		for (int i = 0; i < tc; i++) {
			int arrSize = Integer.parseInt(br.readLine());
			String[] arrElements = br.readLine().split(" ");
			int[] arr = new int[arrSize];
			for(int j = 0; j < arrSize; j++) {
				arr[j] = Integer.parseInt(arrElements[j]);
			}
			int result = mergeIt(arr);
			System.out.println(result);
		}
	}

	private static int mergeIt(int[] arr) {
		int p1 = 0, p2 = arr.length - 1;
		int count = 0;
		Arrays.sort(arr);
		while(p1 < p2) {
			if(arr[p1] % 3 == 0) {
				p1++;
			}
			else if(arr[p2] % 3 == 0) {
				p2--;
			}
			else {
				if((arr[p1] + arr[p2]) % 3 == 0 && arr[p1] != -1) {
					arr[p2] = arr[p1] + arr[p2];
					arr[p1] = -1;
					p2--;
					p1++;
				} else {
					arr[p2] = arr[p1] + arr[p2];
					arr[p1] = -1;
					p1++;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 3 == 0) count++;
		}
		return count;
	}

}
