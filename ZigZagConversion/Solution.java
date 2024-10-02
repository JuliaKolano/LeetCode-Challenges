package ZigZagConversion;

// The string "PAYPALISHING" is written in a zigzag pattern on a given number of rows like this:
// (You might want to display this pattern in a fixed font for better legibility)
// P   A   H   N
// A P L S I I G
// Y   I   R
// And then read line by line: "PAHNAPLSIIGYIR".
// Write the code that will take a string and make this conversion given a number of rows.

public class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public String convert(String s, int numRows) {

        char[] c = s.toCharArray();
        int length = c.length;
        StringBuffer[] sb = new StringBuffer[numRows];

        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuffer();
        }

        int i = 0;

        while (i < length) {

            // Vettically down
            for (int index = 0; index < numRows && i < length; index++) {
                sb[index].append(c[i++]);
            }

            // Obliquely up
            for (int index = numRows - 2; index >= 1 && i < length; index--) {
                sb[index].append(c[i++]);
            }
        }

        for (int index = 1; index < sb.length; index++) {
            sb[0].append(sb[index]);
        }

        return sb[0].toString();
    }
}