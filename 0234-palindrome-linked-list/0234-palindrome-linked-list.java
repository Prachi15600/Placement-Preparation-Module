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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true; // Single node is always a palindrome

        // Step 1: Find the middle of the linked list
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half
        ListNode secondHalf = reverseList(slow);

        // Step 3: Compare both halves
        ListNode firstHalf = head;
        ListNode temp = secondHalf;
        while (temp != null) {
            if (firstHalf.val != temp.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            temp = temp.next;
        }

        // Optional Step 4: Restore the original list (reverse again)
        reverseList(secondHalf);

        return true;
    }

    // Function to reverse a linked list
    private ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}