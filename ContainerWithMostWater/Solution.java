package ContainerWithMostWater;

// You are given an integer array height of length n. There are vertical lines drawn sucha that the two
// endpoints of the ith line are (i, 0) and (i, height[i]).
// Find two lines that together with the x-axis form a container, such that the container contains the most water.
// Return the maximum zmount of water a container can store.
// Notice that you may not slant the container.

public class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {

            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) left++;
            else right--;
        }

        return maxArea;
    }
}
