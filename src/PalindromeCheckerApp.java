import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to Palindrome Checker Application");

        while(running){
            System.out.println("\nMenu:");
            System.out.println("1. Check a word/phrase");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch(choice){
                case 1:
                    System.out.print("Enter word/phrase: ");
                    String input = sc.nextLine();
                    if(isPalindrome(input)){
                        System.out.println("\"" + input + "\" is a Palindrome");
                    } else {
                        System.out.println("\"" + input + "\" is not a Palindrome");
                    }
                    break;
                case 2:
                    running = false;
                    System.out.println("Exiting application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
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