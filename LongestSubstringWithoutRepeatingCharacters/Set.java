package LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;

// Given a string s, find the length of the longest substring without repeating characters

public class Set {

    // Time Complexity: O(n)
    // Space Complexity: O(min(n,m)), where m is the character set size
    
    public static int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int maxLength = 0;
        HashSet<Character> charSet = new HashSet<>();
        int left = 0;

        for (int right = 0; right < n; right++) {

            if (!charSet.contains(s.charAt(right))) {

                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);

            } else {

                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }

                charSet.add(s.charAt(right));

            }

        }

        return maxLength;

    }

}
