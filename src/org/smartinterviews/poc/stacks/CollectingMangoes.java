package org.smartinterviews.poc.stacks;

import java.util.Stack;

public class CollectingMangoes {
	
	static class MyStack extends Stack<Integer> {
		
		private static final long serialVersionUID = 1L;
		static Integer maxSize = 0;
		
		Stack<Integer> maxSt = new Stack<Integer>();
		
		static final int MAX = 10;
		int top; int maxTop;
		int arr[] = new int[MAX];
		
		MyStack() {
			top = -1;
			maxTop = -1;
		}
		
		@Override
		public Integer push(Integer x) {
			// Check Stack Overflow condition
			if(top > MAX-1) {
				System.out.println("Stack Overflow");
				return -1;
			} else {
				arr[++top] = x;
				if(x > maxSize) {
					maxSize = x;
					maxTop++;
					maxSt.push(x);
				}
			}
			return 0;
		}
		
		@Override
		public Integer pop() {
			int poppedElement = -1;
			// Check Stack Underflow condition
			if(top < 0) {
				System.out.println("Stack Underflow");
			} else {
				poppedElement = arr[top];
				if(poppedElement == maxSize) {
					maxSt.pop();
					maxTop--;
					maxSt.toString();
				}
				arr[top--] = 0;
				System.out.println(poppedElement + " popped from stack");
			}
			return poppedElement;
		}
		
		public void getMaxSize() {
			System.out.println(maxSt.toString());	
			System.out.println("Max Size: " + maxSt.peek());
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

	public static void main(String[] args) {
		MyStack st = new MyStack();
		
		st.push(10);
		st.push(40);
		st.push(23);
		st.push(12);
		st.push(1024);
		st.push(512);
		st.push(3);
		st.push(123124);
		st.push(2048);
		st.pop();
		
		System.out.println(st.toString());
		
		st.getMaxSize();
	}

}
