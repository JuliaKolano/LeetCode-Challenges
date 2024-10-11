package LongestCommonPrefix;

public class Tests {

    public static void main(String[] args) {
        
        HorizontalScanning horizontalScanning = new HorizontalScanning();
        VerticalScanning verticalScanning = new VerticalScanning();
        DivideAndConquer divideAndConquer = new DivideAndConquer();
        BinarySearch binarySearch = new BinarySearch();

        System.out.println("Horizonatal Scanning:");
        System.out.println("strs = [\"flower\", \"flow\", \"flight\"], Answer: " + horizontalScanning.longestCommonPrefix(new String[] {"flower", "flow", "flight"})); // Answer: fl
        System.out.println("strs = [\"dog\", \"racecar\", \"car\"], Answer: " + horizontalScanning.longestCommonPrefix(new String[] {"dog", "racecar", "car"})); // Answer: ""

        System.out.println("\nVertical Scanning:");
        System.out.println("strs = [\"flower\", \"flow\", \"flight\"], Answer: " + verticalScanning.longestCommonPrefix(new String[] {"flower", "flow", "flight"})); // Answer: fl
        System.out.println("strs = [\"dog\", \"racecar\", \"car\"], Answer: " + verticalScanning.longestCommonPrefix(new String[] {"dog", "racecar", "car"})); // Answer: ""

        System.out.println("\nDivide and Conquer:");
        System.out.println("strs = [\"flower\", \"flow\", \"flight\"], Answer: " + divideAndConquer.longestCommonPrefix(new String[] {"flower", "flow", "flight"})); // Answer: fl
        System.out.println("strs = [\"dog\", \"racecar\", \"car\"], Answer: " + divideAndConquer.longestCommonPrefix(new String[] {"dog", "racecar", "car"})); // Answer: ""

        System.out.println("\nBinary Search:");
        System.out.println("strs = [\"flower\", \"flow\", \"flight\"], Answer: " + binarySearch.longestCommonPrefix(new String[] {"flower", "flow", "flight"})); // Answer: fl
        System.out.println("strs = [\"dog\", \"racecar\", \"car\"], Answer: " + binarySearch.longestCommonPrefix(new String[] {"dog", "racecar", "car"})); // Answer: ""
    }
}
