package LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

// Given a string s, find the length of the longest substring without repeating characters

public class UnorderedMap {

    // Time Complexity: O(n)
    // Space Complexity: O(min(m.n)) where m is the character set size
    
    public static int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int maxLength = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        int left = 0;

        for (int right = 0; right < n; right++) {

            if (!charMap.containsKey(s.charAt(right)) || charMap.get(s.charAt(right)) < left) {

                charMap.put(s.charAt(right), right);
                maxLength = Math.max(maxLength, right - left + 1);

            } else {

                left = charMap.get(s.charAt(right)) + 1;
                charMap.put(s.charAt(right), right);

            }

        }

        return maxLength;

    }

}
