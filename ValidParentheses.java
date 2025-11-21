package veer.com;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // Closing brackets
            else {
                if (stack.isEmpty()) return false; // no opening bracket

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty(); // all brackets matched
    }

    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s)); // true
    }
}
