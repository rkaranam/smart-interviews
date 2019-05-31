package org.hackerrank.algorithms;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {

	static void plusMinus(int[] arr) {

		double plus = 0, minus = 0, zeroes = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				zeroes++;
			if (arr[i] > 0)
				plus++;
			if (arr[i] < 0)
				minus++;
		}

		DecimalFormat df = new DecimalFormat("#0.000000");
		System.out.println(df.format(plus / arr.length));
		System.out.println(df.format(minus / arr.length));
		System.out.println(df.format(zeroes / arr.length));

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		plusMinus(arr);

		scanner.close();
	}

}
