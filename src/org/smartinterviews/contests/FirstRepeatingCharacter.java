package org.smartinterviews.contests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// AC
public class FirstRepeatingCharacter {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int tc = Integer.parseInt(br.readLine());

		for (int i = 0; i < tc; i++) {
			String input = br.readLine();
			char result = firstRepeatingCharacter(input);
			bw.write(result + "\n");
		}

		br.close();
		bw.close();
	}

	private static char firstRepeatingCharacter(String input) {
		int[] count = new int[26];
		char result = '.';
		for(int i = 0; i <= input.length() - 1; i++) {
			count[input.charAt(i) - 'a']++;
		}
		for(int i = 0; i <= input.length() - 1; i++) {
			if(count[input.charAt(i) - 'a'] > 1) {
				result = input.charAt(i);
				break;
			}
		}
		return result;
	}

	/*private static char firstRepeatingCharacter(String input) {
		boolean[] cntArray = new boolean[26];
		char repeatedCharacter = '.';
		char[] charArray = input.toCharArray();
		for (char ch : charArray) {
			if (cntArray[ch - 'a'] == true) {
				repeatedCharacter = ch;
				break;
			}
			cntArray[ch - 'a'] = true;
		}
		return repeatedCharacter;
	}*/

}
