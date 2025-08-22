import java.util.*;

/*
 * Program: Reverse Number
 * -----------------------------
 * This program calculates the reverse of a number and stores it before printing.
 */

public class _0011_ReverseNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n = sc.nextInt();  // Input number

        int reverse = 0;
        while (n > 0) {  // Loop until number becomes zero
            int lastDigit = n % 10;      // Extract last digit
            reverse = reverse * 10 + lastDigit;  // Build reverse number
            n /= 10;                     // Remove last digit
        }
        System.out.println("Reverse Number : " + reverse);
    }
}
