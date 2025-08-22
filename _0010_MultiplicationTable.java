import java.util.*;

/*
 * Program: Multiplication Table
 * -----------------------------
 * This program prints the multiplication table of a given number up to 10.
 */

public class _0010_MultiplicationTable {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n = sc.nextInt();  // Input number

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
