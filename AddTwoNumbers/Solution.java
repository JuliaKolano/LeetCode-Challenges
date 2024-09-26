package AddTwoNumbers;

import java.util.LinkedList;

// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order,
// and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
// You may assume the two numbers do not contain any leading zero, except the number 0 itself.

public class Solution {

    // Time Complexity: O(max(m,n))
    // Space Complexity: O(1) without result stored, O(max(m,n)+1) with result stored

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        LinkedList<Integer> result = new LinkedList<>();
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            result.add(current.val);

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;

        }

        System.out.println("result = " + result);
        return dummyHead.next;
    }

}
