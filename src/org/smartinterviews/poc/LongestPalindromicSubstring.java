package org.smartinterviews.poc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class LongestPalindromicSubstring {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int tc = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < tc; i++) {
            int strLength = Integer.parseInt(br.readLine());
            String inpStr = br.readLine().trim();
            int result = longestPalindromicSubstring(inpStr, strLength);
            bw.write(result + "\n");            
        }
        br.close();
        bw.close();
        
    }

    private static int longestPalindromicSubstring(String inpStr, int strLength) {
        int maxLength = 1;
        
        int start = 0;
        int p1, p2;
        
        for(int i = 1; i < strLength; i++) {
            
            // For Even length palindromes
            // p1 = i - 1 and p2 = i
            
            p1 = i - 1;
            p2 = i;
            while(p1 >= 0 && p2 < strLength &&
                    inpStr.charAt(p1) == inpStr.charAt(p2)) {
                if(p2 - p1 + 1 > maxLength) {
                    start = p1;
                    maxLength = p2 - p1 + 1;
                }
                p1--;
                p2++;
            }
            
            // For Odd length palindromes
            // p1 = i - 1 and p2 = i + 1
            
            p1 = i - 1;
            p2 = i + 1;
            while(p1 >= 0 && p2 < strLength &&
                    inpStr.charAt(p1) == inpStr.charAt(p2)) {
                if(p2 - p1 + 1 > maxLength) {
                    start = p1;
                    maxLength = p2 - p1 + 1;
                }
                p1--;
                p2++;
            }
        }
        printLongestPalindromicSubstring(inpStr, start, start + maxLength - 1);
        return maxLength;
    }

    private static void printLongestPalindromicSubstring(String inpStr, int begIndex, int endIndex) {
        System.out.println(inpStr.substring(begIndex, endIndex + 1));
    }

    @SuppressWarnings("unused")
    private static int longestPalindromicSubstringBF(String str, int len) {
        int longestPalindromeLength = Integer.MIN_VALUE; 
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                String substring = str.substring(i, j);
                StringBuilder strbdr = new StringBuilder(substring);
                if (strbdr.reverse().toString().equals(substring)) {                    
                    if(j - i > longestPalindromeLength) {
                        longestPalindromeLength = j - i;
                    }
                }
            }
        }
        return longestPalindromeLength;
    }

}
