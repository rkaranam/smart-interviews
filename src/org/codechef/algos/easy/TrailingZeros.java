package org.codechef.algos.easy;

public class TrailingZeros {

	public static void main(String[] args) {
		int num = 1000000000;
		int result = trailingZeros(num);
		System.out.println(result);
	}

	private static int trailingZeros(int num) {
		int result = 0;
		int temp = num;
		int count = 1;
		while(temp > 1){
			temp = (int) (num/Math.pow(5, count));
			result += temp;
			count++;
		}
		return result;
	}

}
