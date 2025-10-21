# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseKGroup(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        if k == 1 or head == None:
            return head
        curr = head
        count = 0

        while curr is not None and count < k:
            curr = curr.next
            count += 1

        if count < k: return head

        ncurr = head
        prev = None
        

        for i in range(count) :
            temp = ncurr.next
            ncurr.next = prev
            prev = ncurr
            ncurr = temp

        head.next = self.reverseKGroup(ncurr, k)
        return prev