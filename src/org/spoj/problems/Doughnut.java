package org.spoj.problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Doughnut {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());

		for (int i = 0; i < tc; i++) {
			String[] line = br.readLine().split(" ");
			int catCount = Integer.parseInt(line[0]);
			int harryCapacity = Integer.parseInt(line[1]);
			int doughnutWeight = Integer.parseInt(line[2]);
			boolean result = canHarryCarry(catCount, harryCapacity, doughnutWeight);
			System.out.println(result == true ? "yes" : "no");
		}

	}

	// 1 <= c, k, w <= 100
	private static boolean canHarryCarry(int catCount, int harryCapacity, int doughnutWeight) {
		boolean result = false;
		if ((1 <= catCount) && (doughnutWeight <= 100) && (catCount * doughnutWeight <= harryCapacity))
			return true;
		return result;
	}
}
