package LongestCommonPrefix;

// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".

public class DivideAndConquer {
    
    // Time Complexity: O(n)
    // Space Complexity: O(mlog(n))

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) return "";

        return longestCommonPrefix(strs, 0, strs.length - 1);
    }

    private String longestCommonPrefix(String[] strs, int l, int r) {

        if (l == r) return strs[l];

        else {

            int mid = (l + r) / 2;
            String lcpLeft = longestCommonPrefix(strs, l, mid);
            String lcpRight = longestCommonPrefix(strs, mid + 1, r);

            return commonPrefix(lcpLeft, lcpRight);
        }
    }

    private String commonPrefix(String left, String right) {

        int min = Math.min(left.length(), right.length());

        for (int i = 0; i < min; i++) {
            if (left.charAt(i) != right.charAt(i)) return left.substring(0, i);
        }

        return left.substring(0, min);
    }
}
