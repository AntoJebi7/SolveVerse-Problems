import java.util.Stack;
/* 🔥  Streak day 10  */
public class ValidParentheses {
    public boolean isValid(String s) {
        // Create a stack to hold the opening brackets
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // Push the opening brackets onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // For closing brackets, check if the stack has the matching opening bracket
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } 
            // If there is no matching opening bracket or the stack is empty, it's invalid
            else {
                return false;
            }
        }

        // If the stack is empty, then all opening brackets had matching closing brackets
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses validator = new ValidParentheses();
        
        // Test cases
        System.out.println(validator.isValid("()")); // true
        System.out.println(validator.isValid("()[]{}")); // true
        System.out.println(validator.isValid("(]")); // false
        System.out.println(validator.isValid("([)]")); // false
        System.out.println(validator.isValid("{[]}")); // true
    }
}
/* 
 * 
 * 20. Valid Parentheses
Easy
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 */