# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        curr1 = list1
        curr2 = list2
        dummy = ListNode(-1)
        temp = dummy

        while curr1 is not None and curr2 is not None:
            if curr1.val <= curr2.val:
                temp.next = curr1
                curr1 = curr1.next

            else :
                temp.next = curr2
                curr2 = curr2.next

            temp = temp.next
        if curr1 is not None:
            temp.next = curr1
        if curr2 is not None:
            temp.next = curr2

        return dummy.next
        