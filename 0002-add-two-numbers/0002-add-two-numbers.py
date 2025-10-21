# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        curr1 = l1
        curr2 = l2
        res = ListNode(-1)
        dummy = res
        carry = 0

        while curr1 is not None or curr2 is not None or carry > 0:
            val1 = curr1.val if curr1 is not None else 0
            val2 = curr2.val if curr2 is not None else 0

            sum = val1 + val2 + carry
            carry = sum // 10
            res.next = ListNode(sum % 10)
            res = res.next

            if curr1 is not None: curr1 = curr1.next
            if curr2 is not None: curr2 = curr2.next

        return dummy.next
        