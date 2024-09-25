package TwoSum;

import java.util.Arrays;

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target
// You may assume that each input would have exactly one solution, and you may not use the same element twice
// You can return the answer in any order

class TwoSum {

    // Brute Force:
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        // If no valid pair is found, return an empty array instead of null
        return new int[] {};
    }

    
    //Testing Cases
    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[] {2, 7, 11, 15}, 9))); // Answer: [0, 1]
        System.out.println(Arrays.toString(twoSum(new int[] {3, 2, 4}, 6))); // Answer: [1, 2]
        System.out.println(Arrays.toString(twoSum(new int[] {3, 3}, 6))); // Answer: [0, 1]
        
    }

}