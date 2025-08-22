import java.util.*;

/*
 * Program: Weekday Finder
 * -----------------------
 * This program takes a number (1–7) as input and prints the corresponding weekday.
 */

public class _0008_Weekday {
    public static void main (String agrs[]) {
        Scanner sc = new Scanner(System.in);  // Scanner object to take input

        int weekday = sc.nextInt();  // Read a number representing the weekday

        // Use switch-case to map number to weekday
        switch(weekday) {
            case 1 : System.out.println("Sunday");      // If input = 1 → Sunday
                     break;
            case 2 : System.out.println("Monday");      // If input = 2 → Monday
                     break;
            case 3 : System.out.println("Tuesday");     // If input = 3 → Tuesday
                     break;
            case 4 : System.out.println("Wednesday");   // If input = 4 → Wednesday
                     break;
            case 5 : System.out.println("Thursday");    // If input = 5 → Thursday
                     break;
            case 6 : System.out.println("Friday");      // If input = 6 → Friday
                     break;
            case 7 : System.out.println("Saturday");    // If input = 7 → Saturday
                     break;
            default : // If input is not between 1–7
                     System.out.println("Bhai 7 he din hote h, ye konsa number dal diya?");
                     break;
        }
    }
}
