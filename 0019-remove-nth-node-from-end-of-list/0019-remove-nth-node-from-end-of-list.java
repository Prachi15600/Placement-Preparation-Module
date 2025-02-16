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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        ListNode curr = head;
        int count = 0;
        while(curr != null) {
            count++;
            curr = curr.next;
        }

        if(count == 1 && n==1) {
            return null;
        }

        int m = count - n;
        if(m==0) return head.next;
        curr = head;
        for(int i=0; i<=m-2; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return head;

    }
}