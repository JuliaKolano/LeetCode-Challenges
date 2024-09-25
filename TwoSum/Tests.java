package TwoSum;

import java.util.Arrays;

public class Tests {
    
    public static void main(String[] args) {

        // Brute Force
        System.out.println("Brute Force:");
        System.out.println(Arrays.toString(BruteForce.twoSum(new int[] {2, 7, 11, 15}, 9))); // Answer: [0, 1]
        System.out.println(Arrays.toString(BruteForce.twoSum(new int[] {3, 2, 4}, 6))); // Answer: [1, 2]
        System.out.println(Arrays.toString(BruteForce.twoSum(new int[] {3, 3}, 6))); // Answer: [0, 1]
        
        // Two-pass Hash Table
        System.out.println("\nTwo-pass Hash Table:");
        System.out.println(Arrays.toString(TwoPassHashTable.twoSum(new int[] {2, 7, 11, 15}, 9))); // Answer: [0, 1]
        System.out.println(Arrays.toString(TwoPassHashTable.twoSum(new int[] {3, 2, 4}, 6))); // Answer: [1, 2]
        System.out.println(Arrays.toString(TwoPassHashTable.twoSum(new int[] {3, 3}, 6))); // Answer: [0, 1]

        // One-pass Hash Table
        System.out.println("\nOne-pass Hash Table:");
        System.out.println(Arrays.toString(OnePassHashTable.twoSum(new int[] {2, 7, 11, 15}, 9))); // Answer: [0, 1]
        System.out.println(Arrays.toString(OnePassHashTable.twoSum(new int[] {3, 2, 4}, 6))); // Answer: [1, 2]
        System.out.println(Arrays.toString(OnePassHashTable.twoSum(new int[] {3, 3}, 6))); // Answer: [0, 1]
    }

}
