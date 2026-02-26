import java.util.*;

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

        Scanner sc = new Scanner(System.in);

        // UC3: Palindrome check using loop
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

        // UC4: Character array palindrome check
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

        // UC5: Stack-based palindrome check
        System.out.print("Enter another string to check using stack method: ");
        String stackInput = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for(char c : stackInput.toCharArray()) stack.push(c);
        String reversedStack = "";
        while(!stack.isEmpty()) reversedStack += stack.pop();
        if(stackInput.equals(reversedStack)) {
            System.out.println("\"" + stackInput + "\" is a palindrome (stack check).");
        } else {
            System.out.println("\"" + stackInput + "\" is NOT a palindrome (stack check).");
        }

        // UC6: Queue + Stack palindrome check
        System.out.print("Enter another string to check using Queue + Stack method: ");
        String qsInput = sc.nextLine();
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stackQS = new Stack<>();
        for(char c : qsInput.toCharArray()) {
            queue.add(c);
            stackQS.push(c);
        }
        boolean isPalindromeQS = true;
        while(!queue.isEmpty() && !stackQS.isEmpty()) {
            if(!queue.poll().equals(stackQS.pop())) {
                isPalindromeQS = false;
                break;
            }
        }
        if(isPalindromeQS) {
            System.out.println("\"" + qsInput + "\" is a palindrome (Queue + Stack check).");
        } else {
            System.out.println("\"" + qsInput + "\" is NOT a palindrome (Queue + Stack check).");
        }

        // UC7: Deque-based optimized palindrome check
        System.out.print("Enter another string to check using Deque method: ");
        String dequeInput = sc.nextLine();
        Deque<Character> deque = new ArrayDeque<>();
        for(char c : dequeInput.toCharArray()) deque.add(c);

        boolean isPalindromeDeque = true;
        while(deque.size() > 1) {
            if(!deque.removeFirst().equals(deque.removeLast())) {
                isPalindromeDeque = false;
                break;
            }
        }

        if(isPalindromeDeque) {
            System.out.println("\"" + dequeInput + "\" is a palindrome (Deque check).");
        } else {
            System.out.println("\"" + dequeInput + "\" is NOT a palindrome (Deque check).");
        }

        sc.close();
    }
}
