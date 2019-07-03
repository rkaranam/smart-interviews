package org.smartinterviews.poc.stacks;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ImplementStack {
	
	static class Stack {
		static final int MAX = 10;
		int top;
		int arr[] = new int[MAX];
		
		Stack() {
			top = -1;
		}
		
		boolean push(int value) {
			if(top >= MAX-1) {
				// System.out.println("Stack Overflow");
				return false;
			} else {
				arr[++top] = value;
				// System.out.println("\nTop :" + top);
				// System.out.println(value + " pushed into stack.");
				return true;
			}
		}
		
		int pop() {
			if(top < 0) {
				// System.out.println("Stack Underflow");
				return Integer.MIN_VALUE;
			} else {
				int poppedElement = arr[top];
				arr[top--] = 0;
				// System.out.println(poppedElement + " popped from stack.");
				return poppedElement;
			}
		}
		
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("\n");
			sb.append("[");
			for(int i = 0; i < arr.length; i++) {
				sb.append(arr[i]);
				if(i != arr.length - 1) {
					sb.append(", ");
				}
			}
			sb.append("]\n");
			return sb.toString();
		}
		
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int operationsCount = Integer.parseInt(br.readLine());
		Stack st = new Stack();
		
		for(int i = 1; i <= operationsCount; i++) {
			String[] operStr = br.readLine().split(" ");
			if(operStr.length == 2) {
				int eleToInsert = Integer.parseInt(operStr[1]);
				st.push(eleToInsert);
			} else {
				int poppedElement = st.pop();
				String result = poppedElement == Integer.MIN_VALUE ? "Empty" : poppedElement + "";
				bw.write(result);
				bw.write("\n");
			}		
			// System.out.println(st.toString());
		}
		
		br.close();
		bw.close();
		
		/*st.push(101);
		st.push(201);
		st.push(301);
		System.out.println(st.toString());
		int popElement = st.pop();
		System.out.println(popElement == Integer.MIN_VALUE ? "Empty" : popElement);
		System.out.println(st.toString());
		st.push(501);
		System.out.println(st.toString());
		popElement = st.pop();
		System.out.println(popElement == Integer.MIN_VALUE ? "Empty" : popElement);
		popElement = st.pop();
		System.out.println(popElement == Integer.MIN_VALUE ? "Empty" : popElement);
		popElement = st.pop();
		System.out.println(popElement == Integer.MIN_VALUE ? "Empty" : popElement);
		st.push(111);
		System.out.println(st.toString());*/
		
	}

}
