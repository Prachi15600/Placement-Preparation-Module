# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        curr = head
        length = 0

        while curr is not None:
            length += 1
            curr = curr.next

        if length == n:
            return head.next

        curr = head
        nLength = length - n
        for i in range(nLength-1) :
            curr = curr.next

        curr.next = curr.next.next
        return head
        