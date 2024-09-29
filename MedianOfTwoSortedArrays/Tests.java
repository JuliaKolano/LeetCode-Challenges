package MedianOfTwoSortedArrays;

public class Tests {

    public static void main(String[] args) {

        MergeSort mergeSort = new MergeSort();
        RecursiveBinarySearch recursiveBinarySearch = new RecursiveBinarySearch();
        BetterBinarySearch betterBinarySearch = new BetterBinarySearch();
        
        System.out.println("Merge Sort:");
        System.out.println(mergeSort.findMedianSortedArrays(new int[] {1, 3}, new int[] {2})); // Answer: 2.0
        System.out.println(mergeSort.findMedianSortedArrays(new int[] {1, 2}, new int[] {3, 4})); // Answer: 2.5

        System.out.println("\nRecursive Binary Sort:");
        System.out.println(recursiveBinarySearch.findMedianSortedArrays(new int[] {1, 3}, new int[] {2})); // Answer: 2.0
        System.out.println(recursiveBinarySearch.findMedianSortedArrays(new int[] {1, 2}, new int[] {3, 4})); // Answer: 2.5

        System.out.println("\nBetter Binary Sort:");
        System.out.println(betterBinarySearch.findMedianSortedArrays(new int[] {1, 3}, new int[] {2})); // Answer: 2.0
        System.out.println(betterBinarySearch.findMedianSortedArrays(new int[] {1, 2}, new int[] {3, 4})); // Answer: 2.5

    }
    
}
