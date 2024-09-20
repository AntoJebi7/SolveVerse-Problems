'''
🔥  Streak day 9
'''

class Solution(object):
    def shortestPalindrome(self, s: str) -> str:
        if not s or len(s) == 0:
            return s
        
        # Reverse the string
        reversed_s = s[::-1]
        
        # Combine the original string, a separator, and the reversed string
        combined = s + '#' + reversed_s
        
        # Compute the prefix table using the KMP algorithm
        prefix_table = self.computePrefixTable(combined)
        
        # The length of the longest palindrome prefix is stored at the last index of the prefix table
        longest_palindrome_prefix_length = prefix_table[-1]
        
        # Add the reverse of the non-palindromic suffix to the front of the original string
        suffix = s[longest_palindrome_prefix_length:]
        result = suffix[::-1] + s
        
        return result
    
    # KMP algorithm to compute the prefix table
    def computePrefixTable(self, s: str) -> list:
        n = len(s)
        prefix_table = [0] * n
        j = 0  # Length of the previous longest prefix suffix
        
        # Iterate through the string to build the prefix table
        for i in range(1, n):
            # Mismatch: Fall back to the previous match
            while j > 0 and s[i] != s[j]:
                j = prefix_table[j - 1]
            
            # If there is a match, extend the current match
            if s[i] == s[j]:
                j += 1
            
            # Update the prefix table
            prefix_table[i] = j
        
        return prefix_table

# Example usage:
solution = Solution()
s1 = "aacecaaa"
print("Shortest Palindrome for '{}': {}".format(s1, solution.shortestPalindrome(s1)))  # Output: "aaacecaaa"

s2 = "abcd"
print("Shortest Palindrome for '{}': {}".format(s2, solution.shortestPalindrome(s2)))  # Output: "dcbabcd"


'''
214. Shortest Palindrome
Hard
You are given a string s. You can convert s to a 
palindrome
 by adding characters in front of it.

Return the shortest palindrome you can find by performing this transformation.

 

Example 1:

Input: s = "aacecaaa"
Output: "aaacecaaa"
Example 2:

Input: s = "abcd"
Output: "dcbabcd"
 

Constraints:

0 <= s.length <= 5 * 104
s consists of lowercase English letters only.

'''