package PalindromeNumber;

// Given an integer x, return true if x is a palindrome, and false otherwise.
// Solve it without converting the integer to a string.

public class ReverseEntireNumber {

    // Time Complexity: O(log(x))
    // Space Complexity: O(1)

    public boolean isPalindrome(int x) {

        if (x < 0) return false;

        long reversed = 0;
        long temp = x;

        while (temp != 0) {

            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return (reversed == x);
    }
}