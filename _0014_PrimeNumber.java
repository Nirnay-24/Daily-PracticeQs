import java.util.*;

/*
 * Program: Prime Number Checker
 * -----------------------------
 * This program checks if a given number is prime.
 * It uses an optimized approach by checking divisibility up to √n only.
 */

public class _0014_PrimeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();  // Input number

        if (n <= 1) {  
            System.out.println(n + " is not a prime number");
            return;
        }

        boolean isPrime = true;  
        for (int i = 2; i * i <= n; i++) {  // Check divisibility up to √n
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
}
