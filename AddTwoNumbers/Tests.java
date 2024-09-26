package AddTwoNumbers;

public class Tests {
    
    public static void main(String[] args) {
        
        // l1 = [2, 4, 3], l2 = [5, 6, 4]
        System.out.println("l1 = [2, 4, 3]\nl2 = [5, 6, 4]");
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        Solution.addTwoNumbers(l1, l2); // Answer: [7,0,8]
        
        // l1 = [0], l2 = [0]
        System.out.println("\nl1 = [0]\nl2 = [0]");
        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(0);
        Solution.addTwoNumbers(l3, l4); // Answer: [0]

         // l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
         System.out.println("\nl1 = [9,9,9,9,9,9,9]\nl2 = [9,9,9,9]");
         ListNode l5 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
         ListNode l6 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
         Solution.addTwoNumbers(l5, l6); // Answer: [8,9,9,9,0,0,0,1]
    }

}
