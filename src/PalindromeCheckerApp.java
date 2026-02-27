import java.util.*;

public class PalindromeCheckerApp {

    public static boolean stackMethod(String input) {

        String processed = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char ch : processed.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : processed.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static boolean stringBuilderMethod(String input) {

        String processed = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(processed).reverse().toString();

        return processed.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        // Stack Timing
        long start1 = System.nanoTime();
        boolean result1 = stackMethod(input);
        long end1 = System.nanoTime();

        // StringBuilder Timing
        long start2 = System.nanoTime();
        boolean result2 = stringBuilderMethod(input);
        long end2 = System.nanoTime();

        System.out.println("\nStack Method: " + result1);
        System.out.println("Time Taken: " + (end1 - start1) + " ns");

        System.out.println("\nStringBuilder Method: " + result2);
        System.out.println("Time Taken: " + (end2 - start2) + " ns");

        scanner.close();
    }
}
