
public class Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null && strs.length==0) {
            return "";
        }
        String prefix =  strs[0];
        for (int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
            
        }

        return prefix;

    }
    public static void main(String[] args){
        String strs[]={"abc", "abf", "cb", "abd", "ae",};
        Longest_Common_Prefix lcp = new Longest_Common_Prefix();
        System.out.println(lcp.longestCommonPrefix(strs)); // Output: "fl"
    }
}


/*
 * 14. Longest Common Prefix
Solved
Easy
Topics
Companies
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
 */

 /*
  * hint 
If the prefix is at the start of strs[i], indexOf(prefix) will return 0. 
If it returns anything other than 0, it means the current prefix is not a valid prefix of the current string.

  Input: ["flower", "flow", "flight"]

Initialize the prefix: prefix = "flower"

Compare with the second string ("flow"):

"flow".indexOf("flower") is not 0, so shorten the prefix: prefix = "flowe"
"flow".indexOf("flowe") is not 0, so shorten the prefix: prefix = "flow"
"flow".indexOf("flow") is 0, so the prefix matches.

Compare with the third string ("flight"):

"flight".indexOf("flow") is not 0, so shorten the prefix: prefix = "flo"
"flight".indexOf("flo") is not 0, so shorten the prefix: prefix = "fl"
"flight".indexOf("fl") is 0, so the prefix matches.

End of loop: The longest common prefix is "fl".
  */