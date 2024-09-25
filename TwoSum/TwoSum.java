package TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target
// You may assume that each input would have exactly one solution, and you may not use the same element twice
// You can return the answer in any order

class TwoSum {

    // Brute Force:
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)

    public static int[] twoSum1(int[] nums, int target) {
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


    // Two-pass Hash Table:
    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        // In case there is no solution, return an empty array
        return new int[] {};
    }


    // Testing Cases
    public static void main(String[] args) {

        // Brute Force
        System.out.println("Brute Force:");
        System.out.println(Arrays.toString(twoSum1(new int[] {2, 7, 11, 15}, 9))); // Answer: [0, 1]
        System.out.println(Arrays.toString(twoSum1(new int[] {3, 2, 4}, 6))); // Answer: [1, 2]
        System.out.println(Arrays.toString(twoSum1(new int[] {3, 3}, 6))); // Answer: [0, 1]
        

        // Two-pass Hash Table
        System.out.println("Two-pass Hash Table:");
        System.out.println(Arrays.toString(twoSum2(new int[] {2, 7, 11, 15}, 9))); // Answer: [0, 1]
        System.out.println(Arrays.toString(twoSum2(new int[] {3, 2, 4}, 6))); // Answer: [1, 2]
        System.out.println(Arrays.toString(twoSum2(new int[] {3, 3}, 6))); // Answer: [0, 1]
    }

}