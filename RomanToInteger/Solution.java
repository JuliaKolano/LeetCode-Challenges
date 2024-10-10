package RomanToInteger;

import java.util.HashMap;
import java.util.Map;

// Roman numerals are represented by seven different symbols: I, V, X, L, C, D, and M:
// I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, and M = 1000.
// For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII,
// which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
// Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
// Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same
// principle applies to the number nine, which is written as IX. There are six instances where subraction is used:
// 1. I can be placed before V (5) and X (10) to make 4 and 9.
// 2. X can be placed before L (50) and C (100) to make 40 and 90.
// 3. C can be placed before D (500) and M (1000) to make 400 and 900.
// Given a Roman numeral, convert it to an integer.

public class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public int romanToInt(String s) {

        int answer = 0;
        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1); map.put('V', 5); map.put('X', 10); map.put('L', 50);
        map.put('C', 100); map.put('D', 500); map.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {

            if (i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                answer -= map.get(s.charAt(i));
            } else {
                answer += map.get(s.charAt(i));
            }
        }

        return answer;
    }
}