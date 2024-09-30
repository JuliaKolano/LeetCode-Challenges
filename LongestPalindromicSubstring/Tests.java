package LongestPalindromicSubstring;

public class Tests {

    public static void main(String[] args) {
        
        CheckAllSubstrings checkAllSubstrings = new CheckAllSubstrings();
        DynamicProgramming dynamicProgramming = new DynamicProgramming();
        ExpandFromCenters expandFromCenters = new ExpandFromCenters();
        ManachersAlgorithm manachersAlgorithm = new ManachersAlgorithm();

        System.out.println("Check All Substrings:");
        System.out.println(checkAllSubstrings.longestPalindrome("babad")); // Answer: bab or aba
        System.out.println(checkAllSubstrings.longestPalindrome("cbbd")); // Answer: bb

        System.out.println("\nDynamic Programming:");
        System.out.println(dynamicProgramming.longestPalindrome("babad")); // Answer: bab or aba
        System.out.println(dynamicProgramming.longestPalindrome("cbbd")); // Answer: bb

        System.out.println("\nExpand From Centers:");
        System.out.println(expandFromCenters.longestPalindrome("babad")); // Answer: bab or aba
        System.out.println(expandFromCenters.longestPalindrome("cbbd")); // Answer: bb

        System.out.println("\nManacher's Algorithm:");
        System.out.println(manachersAlgorithm.longestPalindrome("babad")); // Answer: bab or aba
        System.out.println(manachersAlgorithm.longestPalindrome("cbbd")); // Answer: bb
    }
}
