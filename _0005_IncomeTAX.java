import java.util.*;

/*
 * Program: Income Tax Calculator
 * ------------------------------
 * This program calculates the tax amount and net income after tax deduction
 * based on the given income and fixed tax slabs.
 */

public class _0005_IncomeTAX {
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);  // Scanner object for taking user input

        // Prompt user to enter income
        System.out.print("Enter your income Rs ");
        float income = sc.nextFloat();  // Read income value as float

        float tax;  // Variable to store calculated tax

        // Case 1: Income up to 5,00,000 -> No tax
        if (income <= 500000) {
            tax = 0;  // No tax applied
            System.out.println("Tax Amount = Rs 0");
            System.out.println("Income After Tax = Rs " + (income - tax));  // Same as income

        // Case 2: Income between 5,00,001 and 10,00,000 -> 20% tax
        } else if (income > 500000 && income <= 1000000) {
            tax = income * 0.2f;  // 20% of income
            System.out.println("Tax Amount = Rs " + tax);
            System.out.println("Income After Tax = Rs " + (income - tax));  // Income after deduction

        // Case 3: Income above 10,00,000 -> 30% tax
        } else {
            tax = income * 0.3f;  // 30% of income
            System.out.println("Tax Amount = Rs " + tax);
            System.out.println("Income After Tax = Rs " + (income - tax));  // Income after deduction
        }
    }
}
