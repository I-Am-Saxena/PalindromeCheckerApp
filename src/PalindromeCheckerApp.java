import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker Application");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter words/phrases separated by comma: ");
        String[] words = sc.nextLine().split(",");

        for(String word : words){
            word = word.trim();
            if(isPalindrome(word)){
                System.out.println("\"" + word + "\" is a Palindrome");
            } else {
                System.out.println("\"" + word + "\" is not a Palindrome");
            }
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