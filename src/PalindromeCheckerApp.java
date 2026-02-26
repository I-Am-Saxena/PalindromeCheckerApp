import java.util.Scanner;

public class PalindromeCheckerApp {

    // Method to check palindrome
    public static boolean isPalindrome(String input) {

        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = "";

        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed += cleaned.charAt(i);
        }

        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("   Welcome to Palindrome Checker ");
        System.out.println("=================================");

        while (true) {

            System.out.println("\nEnter a word or sentence (or type 'exit' to quit): ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for using Palindrome Checker App!");
                break;
            }

            if (isPalindrome(userInput)) {
                System.out.println("Result: It is a PALINDROME ✅");
            } else {
                System.out.println("Result: It is NOT a Palindrome ❌");
            }
        }

        scanner.close();
    }
}