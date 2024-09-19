package Streak_Days;

/* 🔥  Streak day 8  */
import java.util.ArrayList;
import java.util.List;

public class diff_ways_to_add_parenthesis{
    
    // Method to compute all possible results by adding parentheses
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();
        
        // Traverse the expression to find operators
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            
            // If the current character is an operator
            if (c == '+' || c == '-' || c == '*') {
                // Recursively compute for the left and right parts of the operator
                String leftExpr = expression.substring(0, i);
                String rightExpr = expression.substring(i + 1);
                
                List<Integer> leftResults = diffWaysToCompute(leftExpr);
                List<Integer> rightResults = diffWaysToCompute(rightExpr);
                
                // Combine results from left and right parts using the current operator
                for (int left : leftResults) {
                    for (int right : rightResults) {
                        if (c == '+') {
                            result.add(left + right);
                        } else if (c == '-') {
                            result.add(left - right);
                        } else if (c == '*') {
                            result.add(left * right);
                        }
                    }
                }
            }
        }
        
        // If the expression does not contain an operator, it's a number, so return it
        if (result.isEmpty()) {
            result.add(Integer.parseInt(expression));
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        diff_ways_to_add_parenthesis solution = new diff_ways_to_add_parenthesis();
        String expression = "2*3-4*5";
        List<Integer> result = solution.diffWaysToCompute(expression);
        System.out.println(result); // Output: [-34, -14, -10, -10, 10]
    }
}
