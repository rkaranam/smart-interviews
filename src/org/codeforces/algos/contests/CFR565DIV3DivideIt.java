package org.codeforces.algos.contests;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Result: AC
public class CFR565DIV3DivideIt {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());

		for (int i = 0; i < tc; i++) {
			long inp = Long.parseLong(br.readLine());
			int count = 0;
			if (inp == 1) {
				System.out.println(0);
			} else {
				while (inp != 1) {
					if (inp % 2 == 0) {
						inp = inp / 2;
						count++;
					}
					if (inp % 3 == 0) {
						inp = (2 * inp) / 3;
						count++;
					}
					if (inp % 5 == 0) {
						inp = (4 * inp) / 5;
						count++;
					}
					if((inp % 2) != 0 && (inp % 3) != 0 && (inp % 5) != 0 && inp != 1) {
						count = -1;
						break;
					}
				}
				System.out.println(count);
			}
		}
	}

}

