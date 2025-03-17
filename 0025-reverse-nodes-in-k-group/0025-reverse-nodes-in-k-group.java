/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        
        if (head == null || k == 1) return head;

        // Step 1: Count nodes to check if we have at least k nodes
        ListNode temp = head;
        int count = 0;
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }

        // If less than k nodes remain, return as is
        if (count < k) return head;

        // Step 2: Reverse k nodes
        ListNode prev = null, curr = head, next = null;
        for (int i = 0; i < k; i++) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Recursively call reverseKGroup for the remaining list
        head.next = reverseKGroup(curr, k);

        // Step 4: Return new head (which is prev after reversal)
        return prev;
    }
}