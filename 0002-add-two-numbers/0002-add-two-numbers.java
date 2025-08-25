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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(-1);
        ListNode dummy = res;
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        int carry = 0;

        while(curr1 != null || curr2 != null || carry > 0) {
            int val1 = (curr1 != null) ? curr1.val : 0;
            int val2 = (curr2 != null) ? curr2.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum/10;
            res.next = new ListNode(sum%10);
            res = res.next;
            if(curr1 != null) curr1 = curr1.next;
            if(curr2 != null) curr2 = curr2.next;
        }

        return dummy.next;
    }
}