package org.smartinterviews.poc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadMatrix {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int matSize = Integer.parseInt(br.readLine());
		
		int[][] matrix = new int[matSize][matSize];
		
		for(int i = 0; i < matSize; i++) {
			String[] line = br.readLine().split(" ");
			for(int j = 0; j < matSize; j++) {
				matrix[i][j] = Integer.parseInt(line[j]);
			}
		}
		
		for(int i = 0; i < matSize; i++) {
			for(int j = 0; j < matSize; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
