import java.util.Scanner;

/**
 * *
 * =========================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * =========================================================
 * Use Case 4: Character Array Based Validation
 *
 * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique.
 *
 * At this stage, the application:
 * - Converts string to char array
 * - Uses start and end pointers
 * - Compares characters efficiently
 * - Displays the result
 *
 * This reduces extra memory usage.
 *
 * @author Developer
 * @version 4.0
 */
public class UseCase4PalindromeCheckerApp {

    /**
     * Application entry point for UC4.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Step 1: Convert string to char array
        char[] charArray = input.toLowerCase().toCharArray();

        // Step 2: Initialize two pointers
        int start = 0;
        int end = charArray.length - 1;
        boolean isPalindrome = true;

        // Step 3: Compare characters using two-pointer technique
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break; // Exit early if a mismatch is found
            }
            start++; // Move forward
            end--;   // Move backward
        }

        // Step 4: Display the result
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}