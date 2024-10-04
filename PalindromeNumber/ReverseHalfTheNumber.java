package PalindromeNumber;

// Given an integer x, return true if x is a palindrome, and false otherwise.
// Solve it without converting the integer to a string.

public class ReverseHalfTheNumber {
    
    // Time Complexity: O(log(x))
    // Space Complexity: O(1)

    public boolean isPalindrome(int x) {

        if (x < 0 || (x != 0 && x % 10 == 0)) return false;

        int reversed = 0;

        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return (x == reversed) || (x == reversed / 10);
    }
}
