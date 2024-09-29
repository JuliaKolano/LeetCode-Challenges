package MedianOfTwoSortedArrays;

// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
// The overall run time complexity should be O(log(m+n)).

public class MergeSort {
    
    // Time Complexity: O(m+n)
    // Space Complexity: O(1)

    private int p1 = 0, p2 = 0;

    // Get the smaller value between nums1[p1] and nums2[p2] and move the pointer forwards

    private int getMin(int[] nums1, int[] nums2) {

        if (p1 < nums1.length && p2 < nums2.length) {
            return nums1[p1] < nums2[p2] ? nums1[p1++] : nums2[p2++];
        } else if (p1 < nums1.length) {
            return nums1[p1++];
        } else if (p2 < nums2.length) {
            return nums2[p2++];
        }

        return -1;

    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length, n = nums2.length;

        if ((m + n) % 2 == 0) {

            for (int i = 0; i < (m + n) / 2 - 1; i++ ) {
                getMin(nums1, nums2);
            }
            return (double) (getMin(nums1, nums2) + getMin(nums1, nums2)) / 2;

        } else {

            for (int i = 0; i < (m + n) / 2; ++i) {
                getMin(nums1, nums2);
            }
            return getMin(nums1, nums2);

        }
    }
}
