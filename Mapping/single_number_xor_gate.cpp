/*
136. Single Number
Easy


Hint
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
 

Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.
*/

#include <iostream>
#include <unordered_map>
#include <vector>
using namespace std;

class Solution {
public:
    int singleNumber(vector<int>& nums) {
        unordered_map<int, int> umap;
        
        // Count occurrences of each number
        for (int i = 0; i < nums.size(); i++) {
            umap[nums[i]]++;
        }
        
        // Find the number that appears exactly once
        for (int i = 0; i < nums.size(); i++) {
            if (umap[nums[i]] == 1) {
                return nums[i];
            }
        }
        
        return 0; // If no such number exists (although not expected in typical single-number problems)
    }
};

int main() {
    // Create an instance of the Solution class
    Solution solution;

    // Example vector (the number '4' appears once, all others appear twice)
    vector<int> nums = {4, 1, 2, 1, 2};

    // Call the singleNumber method
    int result = solution.singleNumber(nums);

    // Print the result
    cout << "The single number is: " << result << endl;

    return 0;
}


/*
brutefore hint
for (int i = 0; i < 3; i++) {      // Outer loop (loop over i)
    for (int j = 0; j < 3; j++) {  // Inner loop (loop over j)
        // Code block
        cout << "i = " << i << ", j = " << j << endl;
    }
}
op:
i = 0, j = 0
i = 0, j = 1
i = 0, j = 2
i = 1, j = 0
i = 1, j = 1
i = 1, j = 2
i = 2, j = 0
i = 2, j = 1
i = 2, j = 2

Solution : 
class Solution {
public:
    int singleNumber(vector<int>& nums) {
        for(int i=0;i,nums.size();i++){
            int flag =0;
            for(int j = 0; j<nums.size(); j++){
                if(i==j){
                    continue;
                }
                if(nums[i]==nums[j]){
                    flag = 1;
                    continue;
                }
            }
            if(flag == 0){
                return nums[i];
            }
        }
        return 0;
    }
};


*/
