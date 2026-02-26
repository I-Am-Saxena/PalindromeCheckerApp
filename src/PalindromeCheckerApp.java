import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome message
        System.out.println("Palindrome Checker Application");
        System.out.println("Version: 1.0.0");

        // UC2: Hardcoded palindrome check
        String hardcodedWord = "madam"; 
        String reversedHardcoded = new StringBuilder(hardcodedWord).reverse().toString();

        if(hardcodedWord.equals(reversedHardcoded)) {
            System.out.println("\"" + hardcodedWord + "\" is a palindrome.");
        } else {
            System.out.println("\"" + hardcodedWord + "\" is NOT a palindrome.");
        }

        // UC3: Palindrome check using loop
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome: ");
        String input = sc.nextLine();

        String reversedInput = "";
        for(int i = input.length() - 1; i >= 0; i--) {
            reversedInput += input.charAt(i); // manually building reversed string
        }

        if(input.equals(reversedInput)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }

        sc.close();
    }
}
