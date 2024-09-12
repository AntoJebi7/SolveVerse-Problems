import java.util.HashSet;
import java.util.Set;

public class CountNoOfConsistentStrings {
    
    public int countConsistentStrings(String allowed, String[] words) {
        // Create a set of allowed characters
        Set<Character> allowedChars = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            allowedChars.add(c);
        }
        
        int count = 0;
        
        // Iterate through each word
        for (String word : words) {
            boolean isConsistent = true;
            // Check if each character in the word is in the allowed set
            for (char c : word.toCharArray()) {
                if (!allowedChars.contains(c)) {
                    isConsistent = false;
                    break;
                }
            }
            // Increment the count if the word is consistent
            if (isConsistent) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        CountNoOfConsistentStrings solution = new CountNoOfConsistentStrings();
        
        // Example test case
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        
        int result = solution.countConsistentStrings(allowed, words);
        System.out.println("Number of consistent strings: " + result);  // Output: 2
    }
}
