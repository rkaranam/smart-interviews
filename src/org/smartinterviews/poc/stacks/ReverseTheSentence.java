package org.smartinterviews.poc.stacks;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Stack;

public class ReverseTheSentence {

	static Stack<String> st = new Stack<String>();

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int tc = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < tc; i++) {
            String inpStr = br.readLine();
            pushToStack(inpStr);
            String result = reversedSentence();
            bw.write(result + "\n");            
        }
        br.close();
        bw.close();
	}

	private static String reversedSentence() {
		ArrayList<String> arrList = new ArrayList<String>();
		while (!st.isEmpty()) {
			arrList.add(st.pop());
		}
		String[] strRev = arrList.toString().split(", ");
		String result = new String();
		for (String revWord : strRev) {
			result = result + revWord + " ";
		}
		return result.substring(1, result.length() - 2);
	}

	private static void pushToStack(String str) {
		String[] words = str.split(" ");
		for (String word : words) {
			st.push(word);
		}
	}

}
