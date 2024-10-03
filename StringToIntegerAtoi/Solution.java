package StringToIntegerAtoi;

// Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.
// The algorithm for myAtoi(string s) is as follows:
// 1. Whitespace: Ignore any leading whitespace (" ").
// 2. Signdness: Determine the sign by checking if the next character is '-' of '+', assuming positivity is neither present
// 3. Conversion: Read the integer by skipping leading zeros until non-digit character is encountered
// or the end of the string is reached. If no digits were read, then result is 0.
// 4. Rounding: If the integer is out of the 32-bit signed integer range [-2^31, 2^31 - 1], then round the integer to remain in the range.
// Specifically, integers less than -2^31 should be rounded to -2^31, and integers greater than 2^31 - 1 should be rounded to 2^31 - 1.
// Return the integer as the final result.

public class Solution {

    // Time Complexity: O()
    // Space Complexity: O()

    public int myAtoi(String s) {

        final int length = s.length();
        final int maxLimit = Integer.MAX_VALUE / 10;
        int index = 0;
        int result = 0;

        if (length == 0) return 0;


        // Skipping whitespaces
        while (index < length && s.charAt(index) == ' ') index++;

        if (index == length) return 0;

        char c = s.charAt(index);
        boolean isNegative = c == '-';

        // Handle sign cases
        if (isNegative || c == '+') index++;

        // Converting digit (in character form) to interger form
        // Iterate until non-digit character is found
        while (index < length && isDigit(c = s.charAt(index))) {

            // s.charAt(index) - '0' is to convert the char digit into int digit
            // else it will store the ASCII value of the char digit
            // so we ASCII of char - ASCII of '0' to get the int digit
            int digit = c - '0';

            // To avoid integer overflow
            if (result > maxLimit || (result == maxLimit && digit > 7)) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            // Adding digits at their desired place value
            result = (result * 10) + digit;

            ++index;
        }

        return  isNegative ? -result : result;
    }

    private boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }
}