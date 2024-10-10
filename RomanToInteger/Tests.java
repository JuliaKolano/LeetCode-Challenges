package RomanToInteger;

public class Tests {
    
    public static void main(String[] args) {
        
        Solution solution = new Solution();

        System.out.println("s = III, Answer: " + solution.romanToInt("III"));
        System.out.println("s = LVIII, Answer: " + solution.romanToInt("LVIII"));
        System.out.println("s = MCMXCIV, Answer: " + solution.romanToInt("MCMXCIV"));
    }
}
