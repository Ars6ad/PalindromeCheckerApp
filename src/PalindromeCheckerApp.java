import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC1
        displayWelcomeMessage();

        // UC2
        checkHardcodedPalindrome();

        // UC3
        checkPalindromeUsingLoop();

        // UC4
        checkPalindromeUsingTwoPointers();

        // UC5
        checkPalindromeUsingStack();

        // UC6
        checkPalindromeUsingQueueStack();

        // UC7
        checkPalindromeUsingDeque();

        System.out.println("Application is ready for palindrome processing...");
    }

    // ===== UC1 =====
    public static void displayWelcomeMessage() {
        System.out.println("=========================================");
        System.out.println("        PALINDROME CHECKER APP           ");
        System.out.println("=========================================");
        System.out.println("Application Version : 1.0.0");
        System.out.println("Developed for: Learning Git & Java");
        System.out.println("=========================================");
    }

    // ===== UC2 =====
    public static void checkHardcodedPalindrome() {
        String word = "madam";
        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println("Result: " + word + " is a palindrome ✅");
        } else {
            System.out.println("Result: " + word + " is NOT a palindrome ❌");
        }
    }

    // ===== UC3 =====
    public static void checkPalindromeUsingLoop() {
        String word = "racecar";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        if (word.equals(reversed)) {
            System.out.println("Result: " + word + " is a palindrome ✅");
        } else {
            System.out.println("Result: " + word + " is NOT a palindrome ❌");
        }
    }

    // ===== UC4 =====
    public static void checkPalindromeUsingTwoPointers() {
        String word = "level";
        int left = 0;
        int right = word.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("Result: " + word + " is a palindrome ✅");
        } else {
            System.out.println("Result: " + word + " is NOT a palindrome ❌");
        }
    }

    // ===== UC5 =====
    public static void checkPalindromeUsingStack() {
        String word = "deed";
        Stack<Character> stack = new Stack<>();

        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        if (word.equals(reversed)) {
            System.out.println("Result: " + word + " is a palindrome ✅");
        } else {
            System.out.println("Result: " + word + " is NOT a palindrome ❌");
        }
    }

    // ===== UC6 =====
    public static void checkPalindromeUsingQueueStack() {
        String word = "level";
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (char c : word.toCharArray()) {
            queue.add(c);   // FIFO
            stack.push(c);  // LIFO
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Result: " + word + " is a palindrome ✅");
        } else {
            System.out.println("Result: " + word + " is NOT a palindrome ❌");
        }
    }

    // ===== UC7 =====
    public static void checkPalindromeUsingDeque() {
        String word = "rotor";
        Deque<Character> deque = new LinkedList<>();

        for (char c : word.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Result: " + word + " is a palindrome ✅");
        } else {
            System.out.println("Result: " + word + " is NOT a palindrome ❌");
        }
    }
}