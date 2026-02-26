import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker Application");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a phrase to check: ");
        String input = sc.nextLine();

        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        String reversed = "";
        for(int i = cleaned.length() - 1; i >= 0; i--){
            reversed += cleaned.charAt(i);
        }

        if(cleaned.equals(reversed)){
            System.out.println("\"" + input + "\" is a Palindrome");
        } else {
            System.out.println("\"" + input + "\" is not a Palindrome");
        }

        sc.close();
    }
}