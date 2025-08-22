import java.util.*;

/*
 * Program: Sum of Even and Odd Numbers
 * ------------------------------------
 * This program reads a list of numbers and separately calculates
 * the sum of even and odd numbers.
 */
 
public class _0012_SumEvenAndOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Scanner object for input

        System.out.print("Total number : ");
        int n = sc.nextInt();  // Total numbers to be entered

        int sumEven = 0, sumOdd = 0; // Variables to store sums

        while (n > 0) { // Loop until all numbers are processed
            int i = sc.nextInt();  // Read each number
            if (i % 2 == 0) { // Check if the number is even
                sumEven += i; // Add to even sum
            } else { // Otherwise, it's odd
                sumOdd += i; // Add to odd sum
            }
            n--; // Decrease count of remaining numbers
        }
        
        // Print the results
        System.out.println("Sum of odd = " + sumOdd);
        System.out.println("Sum of even = " + sumEven);
    }
}