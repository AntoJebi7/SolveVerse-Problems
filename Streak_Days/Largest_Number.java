/* 🔥  Streak day 7  */

package Streak_Days;
import java.util.Arrays;
import java.util.Comparator;
public class Largest_Number {
    public String largestNumber(int[] nums) {
        // Convert the array of integers to an array of strings
        String[] numStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrs[i] = String.valueOf(nums[i]);
        }
        
        // Sort the strings using a custom comparator
        Arrays.sort(numStrs, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1); // Compare based on the combined string
            }
        });
        
        // If after sorting, the largest number is "0", then return "0"
        if (numStrs[0].equals("0")) {
            return "0";
        }
        
        // Join the sorted strings to form the largest number
        StringBuilder result = new StringBuilder();
        for (String numStr : numStrs) {
            result.append(numStr);
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Largest_Number solution = new Largest_Number();
        int[] nums = {3, 30, 34, 5, 9};
        System.out.println(solution.largestNumber(nums)); // Output: 9534330
    }
}
/*
 * 
 * 179. Largest Number
Solved
Medium
Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.

Since the result may be very large, so you need to return a string instead of an integer.

 

Example 1:

Input: nums = [10,2]
Output: "210"
Example 2:

Input: nums = [3,30,34,5,9]
Output: "9534330"
 

Constraints:

1 <= nums.length <= 100
0 <= nums[i] <= 109
 */