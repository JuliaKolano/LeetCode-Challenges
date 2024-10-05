package RegularExpressionMatching;

// Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
// '.' matches any single character.
// '*' matches zero or more of the preceding character.
// The matching should cover the entire input string (not partial).

public class DynamicProgrammingBottomUp {
    
    // Time Complexity: O(sp)
    // Space Complexity: O(sp)

    public boolean isMatch(String s, String p) {

        boolean [][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[s.length()][p.length()] = true;

        for (int i = s.length(); i >= 0; i--) {

            for (int j = p.length() - 1; j >= 0; j--) {

                boolean firstMatch = (i < s.length() &&
                                    (p.charAt(j) == s.charAt(i) || p.charAt(j) == '.'));

                if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
                    dp[i][j] = dp[i][j + 2] || (firstMatch && dp[i + 1][j]);
                } else {
                    dp[i][j] = firstMatch && dp[i + 1][j + 1];
                }
            }
        }

        return dp[0][0];
    }
}
