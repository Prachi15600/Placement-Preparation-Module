# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        nodeList = []
        while head!=None:
            nodeList.append(head)
            head = head.next
        return nodeList[len(nodeList)//2]