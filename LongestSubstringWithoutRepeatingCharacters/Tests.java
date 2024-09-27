package LongestSubstringWithoutRepeatingCharacters;

public class Tests {
    
    public static void main(String[] args) {
        
        // Set Solution
        System.out.println("Set:");
        System.out.println(Set.lengthOfLongestSubstring("abcabcbb")); // Answer: 3
        System.out.println(Set.lengthOfLongestSubstring("bbbb")); // Answer: 1
        System.out.println(Set.lengthOfLongestSubstring("pwwkew")); // Answer: 3

        // Unordered Map Solution
        System.out.println("\nUnordered Map:");
        System.out.println(UnorderedMap.lengthOfLongestSubstring("abcabcbb")); // Answer: 3
        System.out.println(UnorderedMap.lengthOfLongestSubstring("bbbb")); // Answer: 1
        System.out.println(UnorderedMap.lengthOfLongestSubstring("pwwkew")); // Answer: 3

        // Integer Array Solution
        System.out.println("\nInteger Array:");
        System.out.println(IntegerArray.lengthOfLongestSubstring("abcabcbb")); // Answer: 3
        System.out.println(IntegerArray.lengthOfLongestSubstring("bbbb")); // Answer: 1
        System.out.println(IntegerArray.lengthOfLongestSubstring("pwwkew")); // Answer: 3


    }

}
