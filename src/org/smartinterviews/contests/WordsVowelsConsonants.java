package org.smartinterviews.contests;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class WordsVowelsConsonants {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < tc; i++) {
            String str = br.readLine().trim();
            str = str.replaceAll("\\s+", " ");
            String[] words = str.split(" ");
            int wordsCount = str.isEmpty() ? 0 : words.length;
            int vowelsCount = 0, consonantsCount = 0;
            System.out.println(Arrays.deepToString(words));
            for(String word : words) {
            	char[] letters = word.toCharArray();
            	for(int k = 0; k < letters.length; k++) {
            		if(letters[k] == 'a' || letters[k] == 'e' || letters[k] == 'i' || letters[k] == 'o' || letters[k] == 'u' 
            				|| letters[k] == 'A' || letters[k] == 'E' || letters[k] == 'I' || letters[k] == 'O' ||letters[k] == 'U') {
            			vowelsCount++;
            		} 
            		else if((letters[k] >= 65 && letters[k] <= 90) ||
            				(letters[k] >= 97 && letters[k] <= 122)) {
            			consonantsCount++;
            		}
            	}
            }
            System.out.println(wordsCount + " " + vowelsCount + " " + consonantsCount);
        }
        
	}

}
