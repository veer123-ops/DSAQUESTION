package veer.com;


import java.util.Stack;

public class BalancedBrackets {
    public static boolean isBalanced(String str) {
        
        Stack<Character> stack = new Stack<>();
        
        
        for (char ch : str.toCharArray()) {
        
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            
            else if (ch == ')' || ch == '}' || ch == ']') {
                
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || 
                    (ch == '}' && top != '{') || 
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String test1 = "{[()]}";
        String test2 = "{[(])}";
        
        System.out.println("Is test1 balanced? " + isBalanced(test1));  // true
        System.out.println("Is test2 balanced? " + isBalanced(test2));  // false
    }
}
