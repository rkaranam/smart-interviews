package org.smartinterviews.poc.hashing;

/**
 * Given a dictionary that contains mapping of employee and his manager as a number of (employee, manager) pairs like below.
 * { "A", "C" },
 * { "B", "C" },
 * { "C", "F" },
 * { "D", "E" },
 * { "E", "F" },
 * { "F", "F" }
 *
 * In this example C is manager of A,
 * C is also manager of B, F is manager
 * of C and so on.
 *
 * Write a function to get no of employees under each manager in the hierarchy not just their direct reports. It may be assumed that an employee directly reports to only one manager. In the above dictionary the root node/ceo is listed as reporting to himself.
 *
 * Output should be a Dictionary that contains following.
 *
 * A - 0
 * B - 0
 * C - 2
 * D - 0
 * E - 1
 * F - 5
 */

public class EmployeesUnderEveryEmployee {

    public static void main(String[] args) {

    }

}
