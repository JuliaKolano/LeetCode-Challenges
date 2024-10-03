package StringToIntegerAtoi;

public class Tests {

    public static void main(String[] args) {
        
        Solution solution = new Solution();

        System.out.println(solution.myAtoi("42")); // Answer: 42
        System.out.println(solution.myAtoi("  -042")); // Answer: -42
        System.out.println(solution.myAtoi("1337c0d3")); // Answer: 1337
        System.out.println(solution.myAtoi("0-1")); // Answer: 0
        System.out.println(solution.myAtoi("words and 987")); // Answer: 0
    }
}
