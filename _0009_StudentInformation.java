import java.util.*;

/*
 * Program: Student Information
 * ----------------------------
 * This program collects a student's name, age, and 10th-grade percentage,
 * then prints a personalized message based on the input.
 */

public class _0009_StudentInformation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);  // Scanner object for taking input

        System.out.println("\nWhat's your name?");
        String name = sc.nextLine();  // Read name as a string input

        System.out.println("Tell your age");
        int age = sc.nextInt();  // Read age as an integer input

        System.out.println("How much percentage did you score in class 10th?");
        float percentage = sc.nextFloat();  // Read percentage as float input

        // Print personalized message using the collected details
        System.out.println("Hello " + name + ", it's nice to see you. Glad to know that you scored " + percentage + "% in your class 10th.");
        System.out.println("Since your age is " + age + ", you are eligible to take admission in college.");
    }
}
