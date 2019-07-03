package org.smartinterviews.poc.stacks;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class ImplementStackUsingInbuilt {

	public static void main(String[] args) throws Exception {
		
		Stack<Integer> st = new Stack<Integer>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int operationsCount = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= operationsCount; i++) {
			String[] operStr = br.readLine().split(" ");
			if(operStr.length == 2) {
				int eleToInsert = Integer.parseInt(operStr[1]);
				st.push(eleToInsert);
			} else {
				if(st.empty()) {
					bw.write("Empty" + "\n");
				} else {
					Integer poppedElement = st.pop();
					bw.write(poppedElement.toString() + "\n");
				}
			}		
		}
		
		br.close();
		bw.close();
	}

}

