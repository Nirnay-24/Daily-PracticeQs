import java.util.*;

/*
 * Program: Basic Arithmetic Operations
 * ------------------------------------
 * This program performs basic arithmetic operations (addition, subtraction,
 * multiplication, division, and modulo) on two integers.
 */

public class _0003_BasicCalculation {
    public static void main(String args[]) {
        int a = 10;  // Assign value to variable a
        int b = 3;   // Assign value to variable b

        int sum = a + b;        // Add values of a and b
        int diff = a - b;       // Subtract b from a
        int multiply = a * b;   // Multiply values of a and b
        int divide = a / b;     // Integer division of a by b
        int reminder = a % b;   // Remainder when a is divided by b

        // Print results of calculations
        System.out.println(sum);      
        System.out.println(diff);     
        System.out.println(multiply); 
        System.out.println(divide);   
        System.out.println(reminder); 
    }
}
