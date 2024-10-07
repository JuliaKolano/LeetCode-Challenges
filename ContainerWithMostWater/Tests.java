package ContainerWithMostWater;

public class Tests {
    
    public static void main(String[] args) {

        Solution solution = new Solution();
        
        System.out.println("height = [1, 8, 6, 2, 5, 4, 8, 3, 7], Answer: " + solution.maxArea(new int[] {1,8,6,2,5,4,8,3,7})); // Answer: 49
        System.out.println("height = [1, 1], Answer: " + solution.maxArea(new int[] {1,1})); // Answer: 1
    }
}
