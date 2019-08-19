package org.smartinterviews.contests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.TreeSet;

public class PalindromicConcatenation {
    private static String isPalindromic(String str1, String str2) {
        TreeSet<Character> descTreeSet = new TreeSet<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o1.compareTo(o2);
            }
        });

        for (int i = 0; i < str1.length(); i++) {
            Character ch = str1.charAt(i);
            descTreeSet.add(ch);
        }

        /*System.out.println("DescTreeSet: ");
        descTreeSet.stream().forEach(System.out::println);*/

        for (int i = 0; i < str2.length(); i++) {
            if (descTreeSet.contains(str2.charAt(i))) return "YES";
        }

        return "NO";
    }
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            String[] words = br.readLine().split(" ");
            String str1 = words[0];
            String str2 = words[1];
            String result = isPalindromic(str1, str2);
            bw.write(result + "\n");
        }

        br.close();
        bw.close();
    }
}
