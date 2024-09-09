import java.util.Stack;

public class Main {

    
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();
        StringBuilder reversedString = new StringBuilder();

        // Push each character of the input string onto the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop each character from the stack and append it to the reversedString
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return reversedString.toString();
    }

    public static void main(String[] args) {
        String myString = "hello";
        String reversedString = reverseString(myString);
        System.out.println(reversedString);
    }
}