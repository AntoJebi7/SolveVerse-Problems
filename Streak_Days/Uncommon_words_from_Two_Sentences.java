/* 🔥  Streak day 6  */

package Streak_Days;
import java.util.*;

public class Uncommon_words_from_Two_Sentences {
    public String[] uncommonFromSentences(String s1, String s2) {
        // Maps to store word counts
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        // Split sentences into words
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");

        // Count frequencies of words in the first sentence
        for (String word : words1) {
            map1.put(word, map1.getOrDefault(word, 0) + 1);
        }

        // Count frequencies of words in the second sentence
        for (String word : words2) {
            map2.put(word, map2.getOrDefault(word, 0) + 1);
        }

        // List to store the uncommon words
        List<String> uncommonWords = new ArrayList<>();

        // Check words in the first sentence
        for (String word : map1.keySet()) {
            if (map1.get(word) == 1 && !map2.containsKey(word)) {
                uncommonWords.add(word);
            }
        }

        // Check words in the second sentence
        for (String word : map2.keySet()) {
            if (map2.get(word) == 1 && !map1.containsKey(word)) {
                uncommonWords.add(word);
            }
        }

        // Convert the list to an array and return
        return uncommonWords.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Uncommon_words_from_Two_Sentences solution = new Uncommon_words_from_Two_Sentences();
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";
        
        String[] result = solution.uncommonFromSentences(s1, s2);
        System.out.println(Arrays.toString(result));  // Output: [sweet, sour]
    }
}
