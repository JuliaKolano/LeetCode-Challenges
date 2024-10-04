package PalindromeNumber;

public class Tests {
    
    public static void main(String[] args) {
        
        ReverseEntireNumber reverseEntireNumber = new ReverseEntireNumber();
        ReverseHalfTheNumber reverseHalfTheNumber = new ReverseHalfTheNumber();

        System.out.println("Reverse the entire number solution:");
        System.out.println(reverseEntireNumber.isPalindrome(121)); // Answer: true
        System.out.println(reverseEntireNumber.isPalindrome(-121)); // Answer: false
        System.out.println(reverseEntireNumber.isPalindrome(10)); // Answer: false

        System.out.println("\nReverse half of the number solution");
        System.out.println(reverseHalfTheNumber.isPalindrome(121)); // Answer: true
        System.out.println(reverseHalfTheNumber.isPalindrome(-121)); // Answer: false
        System.out.println(reverseHalfTheNumber.isPalindrome(10)); // Answer: false
    }
}
