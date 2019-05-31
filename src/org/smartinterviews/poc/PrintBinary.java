package org.smartinterviews.poc;

public class PrintBinary {

	public static void main(String[] args) {
		int num = 12678;
		String numInBinary = singleLinePrintBinary(num).toString();
		System.out.println(numInBinary);
	}

	public static StringBuilder printBinary(int num) {
		StringBuilder result = new StringBuilder();
		for (int i = 31; i >= 0; i--) {
			int mask = 1 << i;
			if ((num & mask) != 0) {
				result.append("1");
			} else {
				result.append("0");
			}
		}
		return result;
	}

	public static StringBuilder singleLinePrintBinary(int num) {
		StringBuilder result = new StringBuilder();
		for (int i = 31; i >= 0; i--)
			result.append(((1 << i) & num) != 0 ? "1" : "0");
		return result;
	}

}
