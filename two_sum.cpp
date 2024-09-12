/* 1. Two Sum
Solved
Easy
Hint
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
*/

#include <iostream>
#include <vector>
#include <unordered_map>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        // Create an unordered_map to store number and its index
        unordered_map<int, int> num_to_index;

        // Iterate through the list of numbers
        for (int i = 0; i < nums.size(); ++i) {
            int complement = target - nums[i]; // Calculate the complement
            
            // Check if the complement is already in the map
            if (num_to_index.find(complement) != num_to_index.end()) {
                // If found, return the indices of the complement and the current number
                return {num_to_index[complement], i};
            }
            
            // If not found, store the index of the current number in the map
            num_to_index[nums[i]] = i;
        }
        
        // Return an empty vector if no solution is found (though the problem guarantees one solution)
        return {};
    }
};

int main() {
    // Create an instance of the Solution class
    Solution solution;

    // Example input
    vector<int> nums = {2, 7, 11, 15};
    int target = 9;

    // Call the twoSum method
    vector<int> result = solution.twoSum(nums, target);

    // Print the result
    cout << "Indices of the two numbers are: " << result[0] << " and " << result[1] << endl;

    return 0;
}
