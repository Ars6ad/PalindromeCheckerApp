
/**
 * ============================================
 * MAIN CLASS - UseCase1PalindromeApp
 * ============================================
 *
 * Use Case 1: Application Entry & Welcome Message
 *
 * Description:
 * This class represents the entry point of the
 * Palindrome Checker Management System.
 *
 * At this stage, the application:
 * - Starts execution from the main() method
 * - Displays a welcome message
 * - Shows application version
 *
 * No palindrome logic is implemented yet.
 * The goal is to establish a clear startup flow.
 *
 * @dhiraj
 * @version 1.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point
     * This is the first method executed by the JVM
     */
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        System.out.println("Application Version: 1.0");

        String input = "MADAM";

        String reversed = new StringBuilder(input)
                .reverse()
                .toString();

        if (input.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}