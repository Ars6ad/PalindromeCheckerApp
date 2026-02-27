import java.util.Stack;
import java.util.Scanner;

// Service class (Encapsulation)
class PalindromeChecker {

    // Exposed method
    public boolean checkPalindrome(String input) {

        String processed = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        // Push all characters to stack
        for (char ch : processed.toCharArray()) {
            stack.push(ch);
        }

        // Compare with reversed order
        for (char ch : processed.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Main Application
public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();

        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        if (checker.checkPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        scanner.close();
    }
}
