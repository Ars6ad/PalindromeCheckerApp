
/**
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * =============================================================
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 */public static void main(String[] args) {
    // Example input for validation
    String input = "radar";
    String reversed = "";

    // Iterate from the last character to the first
    for (int i = input.length() - 1; i >= 0; i--) {
        reversed += input.charAt(i);
    }

    // Comparison logic
    if (input.equals(reversed)) {
        System.out.println(input + " is a palindrome.");
    } else {
        System.out.println(input + " is NOT a palindrome.");
    }
}