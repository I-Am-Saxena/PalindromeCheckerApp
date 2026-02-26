public class PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.println("Palindrome Checker Application");
        System.out.println("Version: 1.0.0");
        System.out.println();

        // UC2: Hardcoded string palindrome check
        String word = "madam";  // Hardcoded string
        boolean isPalindrome = true;

        // Check palindrome
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("The word \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is not a palindrome.");
        }
    }
}
