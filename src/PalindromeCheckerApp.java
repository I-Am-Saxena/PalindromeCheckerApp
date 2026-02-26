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
            reversedInput += input.charAt(i);
        }

        if(input.equals(reversedInput)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }

        // UC4: Character array palindrome check (two-pointer)
        System.out.print("Enter another string to check using char array method: ");
        String charArrayInput = sc.nextLine();
        char[] chars = charArrayInput.toCharArray();

        boolean isPalindrome = true;
        int left = 0, right = chars.length - 1;

        while(left < right) {
            if(chars[left] != chars[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if(isPalindrome) {
            System.out.println("\"" + charArrayInput + "\" is a palindrome (char array check).");
        } else {
            System.out.println("\"" + charArrayInput + "\" is NOT a palindrome (char array check).");
        }

        sc.close();
    }
}
