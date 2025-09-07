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
    ListNode reverse(ListNode node) {
        ListNode curr = node;
        ListNode prev = null;

        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode newHead = reverse(slow.next);
        ListNode first = head;
        ListNode second = newHead;
        while(first != null && second != null) {
            if(first.val != second.val) return false;
            first = first.next;
            second = second.next;
        }

        newHead = reverse(newHead);

        return true;
    }
}