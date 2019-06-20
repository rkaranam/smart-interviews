package org.smartinterviews.contests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class AnagramsEasy {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int tc = Integer.parseInt(br.readLine());

		for (int i = 0; i < tc; i++) {
			String[] input = br.readLine().split(" ");
			String result = checkForAnagrams(input[0], input[1]);
			bw.write(result + "\n");
		}

		br.close();
		bw.close();
		
	}

	private static String checkForAnagrams(String strOne, String strTwo) {
		String result = "True";
		
		if(strOne.length() != strTwo.length()) {
			result = "False";
		} else {
			int[] cnt1 = new int[26];
			int[] cnt2 = new int[26];
			for(int i = 0; i <= strOne.length() - 1; i++) {
				cnt1[strOne.charAt(i) - 'a']++;
				cnt2[strTwo.charAt(i) - 'a']++;
			}
			for(int i = 0; i < cnt1.length - 1; i++) {
				if(cnt1[i] != cnt2[i]) {
					result = "False";
					break;
				}
			}
		}
		
		return result;
	}

}
