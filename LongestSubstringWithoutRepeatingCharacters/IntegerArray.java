package LongestSubstringWithoutRepeatingCharacters;

import java.util.Arrays;

// Given a string s, find the length of the longest substring without repeating characters

public class IntegerArray {
    
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public static int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int maxLength = 0;
        int[] charIndex = new int[128];
        Arrays.fill(charIndex, -1);
        int left = 0;

        for (int right = 0; right < n; right++) {

            if (charIndex[s.charAt(right)] >= left) {

                left = charIndex[s.charAt(right)] + 1;

            }

            charIndex[s.charAt(right)] = right;
            maxLength = Math.max(maxLength, right - left + 1);

        }

        return maxLength;

    }

}
