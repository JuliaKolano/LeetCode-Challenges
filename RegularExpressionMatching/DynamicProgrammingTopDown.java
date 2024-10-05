package RegularExpressionMatching;

// Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
// '.' matches any single character.
// '*' matches zero or more of the preceding character.
// The matching should cover the entire input string (not partial).

enum Result {
    TRUE,
    FALSE
}

public class DynamicProgrammingTopDown {
 
    // Time Complexity: O(sp)
    // Space Complexity: O(sp)

    Result[][] memo;

    public boolean isMatch(String s, String p) {

        memo = new Result[s.length() + 1][p.length() + 1];
        return dp(0, 0, s, p);
    }

    public boolean dp(int i, int j, String s, String p) {

        if (memo[i][j] != null) return memo[i][j] == Result.TRUE;

        boolean answer;

        if (j == p.length()) {
            answer = i == s.length();
        } else {

            boolean firstMatch = (i < s.length() &&
                                (p.charAt(j) == s.charAt(i) || p.charAt(j) == '.'));

            if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
                answer = dp(i, j + 2, s, p) || (firstMatch && dp(i + 1, j, s, p));
            } else {
                answer = firstMatch && dp(i + 1, j + 1, s, p);
            }
        }

        memo[i][j] = answer ? Result.TRUE : Result.FALSE;
        return answer;
    }
}
