/* 🔥  Streak day 3  */
/*
 * Steps to Solve:
Find the Maximum Element: The highest value of a subarray’s bitwise AND is simply the maximum element in the array. Why? Because any subarray that includes a smaller element would reduce the AND result.

Identify Longest Subarray: Once you know the maximum value, look for the longest contiguous subarray of elements that are equal to this maximum value.
 * 
 */
import java.util.Scanner;

class Solution {
    // Function to find the longest subarray with maximum bitwise AND
    public int longestSubarray(int[] nums) {
        // Step 1: Find the maximum value in the array
        int maxVal = Integer.MIN_VALUE;
        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
        }

        // Step 2: Find the length of the longest subarray where all elements are equal to maxVal
        int maxLen = 0;          // Stores the maximum length of subarrays of maxVal
        int currentLen = 0;      // Tracks the current subarray length of maxVal
        
        for (int num : nums) {
            if (num == maxVal) {
                // If current element is the maximum value, increment the current length
                currentLen++;
                maxLen = Math.max(maxLen, currentLen);
            } else {
                // If the current element is not the maximum value, reset the current length
                currentLen = 0;
            }
        }

        // Step 3: Return the maximum length found
        return maxLen;
    }

    public static void main(String[] args) {
        // Step 4: Input and test the solution
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Input array elements
        int[] nums = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Create an instance of the solution class
        Solution solution = new Solution();
        
        // Find and print the longest subarray with maximum bitwise AND
        int result = solution.longestSubarray(nums);
        System.out.println("The length of the longest subarray with maximum bitwise AND is: " + result);

        // Close the scanner
        sc.close();
    }
}
