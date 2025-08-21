import java.util.*;

/*
 * Program: Positive or Negative Checker
 * -------------------------------------
 * This program checks whether a given integer is positive or negative.
 */

public class _0006_PositiveOrNegative {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);  // Scanner object to take input

        int a = sc.nextInt();  // Read an integer from the user

        // Check whether the number is positive or negative
        if (a >= 0) {
            System.out.println(a + " is Positive");
        } else {
            System.out.println(a + " is Negative");
        }
    }
}
