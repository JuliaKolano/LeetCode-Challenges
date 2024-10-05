package RegularExpressionMatching;

public class Tests {

    public static void main(String[] args) {
        
        Recursion recursion = new Recursion();
        DynamicProgrammingTopDown dynamicProgrammingTopDown = new DynamicProgrammingTopDown();
        DynamicProgrammingBottomUp dynamicProgrammingBottomUp = new DynamicProgrammingBottomUp();

        System.out.println("Recursion Solution:");
        System.out.println("s = aa, p = a, " + "Answer: " + recursion.isMatch("aa", "a")); // Answer: false
        System.out.println("s = aa, p = a*, " + "Answer: " + recursion.isMatch("aa", "a*")); // Answer: true
        System.out.println("s = ab, p = .*, " + "Answer: " + recursion.isMatch("ab", ".*")); // Answer: true

        System.out.println("\nTop Down Dynamic Programming Solution:");
        System.out.println("s = aa, p = a, " + "Answer: " + dynamicProgrammingTopDown.isMatch("aa", "a")); // Answer: false
        System.out.println("s = aa, p = a*, " + "Answer: " + dynamicProgrammingTopDown.isMatch("aa", "a*")); // Answer: true
        System.out.println("s = ab, p = .*, " + "Answer: " + dynamicProgrammingTopDown.isMatch("ab", ".*")); // Answer: true

        System.out.println("\nBottom Up Dynamic Programming Solution:");
        System.out.println("s = aa, p = a, " + "Answer: " + dynamicProgrammingBottomUp.isMatch("aa", "a")); // Answer: false
        System.out.println("s = aa, p = a*, " + "Answer: " + dynamicProgrammingBottomUp.isMatch("aa", "a*")); // Answer: true
        System.out.println("s = ab, p = .*, " + "Answer: " + dynamicProgrammingBottomUp.isMatch("ab", ".*")); // Answer: true
    }
    
}
