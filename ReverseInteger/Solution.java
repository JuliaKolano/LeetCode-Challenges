package ReverseInteger;

// Given a signed 32-bit integer x, return x with its digits reversed.
// If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

public class Solution {
    
    // Time Complexity: O(log(x))
    // Space Complexity: O(1)

    public int reverse(int x) {
        
        int reverse = 0;

        while (x != 0) {

            int pop = x % 10;
            x /= 10;

            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }

            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }

            reverse = reverse * 10 + pop;
        }

        return reverse;
    }
}
