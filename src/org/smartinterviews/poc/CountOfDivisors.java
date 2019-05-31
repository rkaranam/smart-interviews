package org.smartinterviews.poc;

public class CountOfDivisors {

    public static void main(String[] args) {
        int num = 1024;
        // int result = countOfDivisors(num);
        int result = optimizedCountOfDivisors(num);
        System.out.println("Count of Divisors: " + result);
    }

    // O(n^1/2)
    public static int optimizedCountOfDivisors(int num) {
        int count = 0;
        for(int i = 1; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                if(num / i == i) { // If divisors are equal, count only one
                    count = count + 1;
                } else { // otherwise, count each one two times
                    count = count + 2;
                }

            }
        }
        return count;
    }

    // O(n)
    public static int countOfDivisors(int num) {
        int count = 0;
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                count++;
            }
        }
        return count;
    }
}
