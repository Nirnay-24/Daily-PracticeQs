import java.util.*;

/*
 * Program: Factorial of a Number
 * ------------------------------
 * This program calculates the factorial of a given number
 * using a while loop and prints the result.
 */

public class _0013_Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();  // Input number

        int fact = 1;  // Initialize factorial result
        System.out.print(n + "! = ");
        while (n > 0) {   // Loop until n becomes 0
            fact *= n;    // Multiply fact by current n
            n--;          // Decrease n by 1
        }
        System.out.println(fact);  // Print the factorial result
    }
}