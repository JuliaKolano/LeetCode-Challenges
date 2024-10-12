package ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that
// i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
// Notice that the solution set must not contain duplicate triplets.

public class Solution {
    
    // Time Complexity: O(n^2log(n))
    // Space Complexity: O(n)

    public List<List<Integer>> threeSum(int[] nums) {
        
        int target = 0;
        Arrays.sort(nums);
        Set<List<Integer>> s = new HashSet<>();
        List<List<Integer>> output = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {

                int sum = nums[i] + nums[j] + nums[k];

                if (sum == target) {

                    s.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    j++;
                    k--;

                } else if (sum < target) j++;
                else k--;
            }
        }

        output.addAll(s);
        return output;
    }
}