package ThreeSum;

public class Tests {
    
    public static void main(String[] args) {
        
        Solution solution = new Solution();

        System.out.println("nums = [-1, 0, 1, 2, -1, -4], Answer: " + solution.threeSum(new int[] {-1, 0, 1, 2, -1, -4})); // Answer: [[-1,-1,2],[-1,0,1]]
        System.out.println("nums = [0, 1, 1], Answer: " + solution.threeSum(new int[] {0, 1, 1})); // Answer: []
        System.out.println("nums = [0, 0, 0], Answer: " + solution.threeSum(new int[] {0, 0, 0})); // Answer: [[0,0,0]]
    }
}
