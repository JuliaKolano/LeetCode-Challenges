package ZigZagConversion;

public class Tests {
    
    public static void main(String[] args) {
        
        Solution solution = new Solution();

        System.out.println(solution.convert("PAYPALISHIRING", 3)); // Answer: PAHNAPLSIIGYIR
        System.out.println(solution.convert("PAYPALISHIRING", 4)); // Answer: PINALSIGYAHRPI
        System.out.println(solution.convert("A", 1)); // Answer: A
    }
}
