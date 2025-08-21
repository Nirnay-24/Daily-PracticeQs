import java.util.*;

/*
 * Program: Square Area Calculator
 * -------------------------------
 * This program calculates the area of a square using its side length.
 */

public class _0007_AreaOfSquare {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);  // Scanner object to take input

        int side = sc.nextInt();  // Read the length of the side of the square
        int area = side * side;   // Calculate area using formula: side × side

        // Print the calculated area
        System.out.println("Area is " + area);
    }
}
