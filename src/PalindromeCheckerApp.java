import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker Application");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word/phrase to check: ");
        String input = sc.nextLine();

        if(isPalindrome(input)){
            System.out.println("\"" + input + "\" is a Palindrome");
        } else {
            System.out.println("\"" + input + "\" is not a Palindrome");
        }

        sc.close();
    }

    public static boolean isPalindrome(String word){
        String cleaned = word.replaceAll("\\s+", "").toLowerCase();
        String reversed = "";
        for(int i = cleaned.length() - 1; i >= 0; i--){
            reversed += cleaned.charAt(i);
        }
        return cleaned.equals(reversed);
    }
}