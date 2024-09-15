/* 🔥  Streak day 4  */
import java.util.HashMap;

public class LongestVowelEvenCountSubstring {
    public int findTheLongestSubstring(String s) {
        // A map to store the first occurrence of each bitmask.
        HashMap<Integer, Integer> bitmaskToIndex = new HashMap<>();
        // Initial state: bitmask = 0, all vowels have even count
        bitmaskToIndex.put(0, -1); 
        
        int bitmask = 0; // This will store the current bitmask representing the parity of vowels
        int maxLength = 0; // This will store the length of the longest valid substring
        
        // Traverse the string character by character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // Update the bitmask based on the current character
            switch (c) {
                case 'a':
                    bitmask ^= (1 << 0); // Toggle bit 0 for 'a'
                    break;
                case 'e':
                    bitmask ^= (1 << 1); // Toggle bit 1 for 'e'
                    break;
                case 'i':
                    bitmask ^= (1 << 2); // Toggle bit 2 for 'i'
                    break;
                case 'o':
                    bitmask ^= (1 << 3); // Toggle bit 3 for 'o'
                    break;
                case 'u':
                    bitmask ^= (1 << 4); // Toggle bit 4 for 'u'
                    break;
            }
            
            // Check if the current bitmask has been seen before
            if (bitmaskToIndex.containsKey(bitmask)) {
                // If yes, calculate the length of the substring
                int prevIndex = bitmaskToIndex.get(bitmask);
                maxLength = Math.max(maxLength, i - prevIndex);
            } else {
                // Otherwise, store the current index as the first occurrence of this bitmask
                bitmaskToIndex.put(bitmask, i);
            }
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        LongestVowelEvenCountSubstring solution = new LongestVowelEvenCountSubstring();
        
        String s = "eleetminicoworoep";
        System.out.println("The length of the longest substring is: " + solution.findTheLongestSubstring(s)); // Output should be 13
    }
}