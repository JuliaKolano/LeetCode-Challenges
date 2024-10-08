package LongestPalindromicSubstring;

// Given a string s, return the longest palindromic substring in s.

public class ExpandFromCenters {
    
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)

    public String longestPalindrome(String s) {

        int[] ans = new int[] {0, 0};

        for (int i = 0; i < s.length(); i++) {

            int oddLength = expand(i, i, s);

            if (oddLength > ans[1] - ans[0] + 1) {

                int dist = oddLength / 2;
                ans[0] = i - dist;
                ans[1] = i + dist;
            }

            int evenLength = expand(i, i + 1, s);

            if (evenLength > ans[1] - ans[0] + 1) {

                int dist = (evenLength / 2) - 1;
                ans[0] = i - dist;
                ans[1] = i + 1 + dist; 
            }
        }

        int i = ans[0];
        int j = ans[1];
        
        return s.substring(i, j + 1);
    }

    private int expand(int i, int j, String s) {

        int left = i;
        int right = j;

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        return right - left - 1;
    }
}
