package org.smartinterviews.contests;

/*
Print mirror image of right-angled triangle using '*'. See examples for more details.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line contains a single integer N - the size of the pattern.

Constraints

1 <= T <= 100
1 <= N <= 100

Output Format

For each test case, print the test case number as shown, followed by the pattern, separated by newline.

Sample Input 0

4
2
1
5
10

Sample Output 0

Case #1:
 *
**
Case #2:
*
Case #3:
    *
   **
  ***
 ****
*****
Case #4:
         *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
**********
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RightAngledTrianglePattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        
        List<Integer> inputList = new ArrayList<Integer>(tc);

        for(int i = 0; i < tc; i++) {
            inputList.add(sc.nextInt());
        }
        
        sc.close();

        // System.out.println(inputList);

        for(int input : inputList) {
            printStars(input, inputList.indexOf(input));
        }

    }

    public static void printStars(int num, int index) {
        int i, j;

        System.out.println("Case #" + (index+1) + ":");

        for(i=0; i<num; i++)
        {

            for(j=num-i-1; j>0; j--)
            {
                System.out.print(" ");
            }

            for(j=0; j<=i; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
