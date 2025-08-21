import java.util.*;

/*
 * Program: Average of Three Numbers
 * ---------------------------------
 * This program takes three integers as input and calculates their average.
 */

public class _0004_AverageOfNumbers {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);  // Scanner object for taking input

        int a = sc.nextInt();  // Read first number
        int b = sc.nextInt();  // Read second number
        int c = sc.nextInt();  // Read third number

        int avg = (a + b + c) / 3;  // Calculate average of three numbers

        // Print the average result
        System.out.println("Average of all input number is " + avg);
    }
}
