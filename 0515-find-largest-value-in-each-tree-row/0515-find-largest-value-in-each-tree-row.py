# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    #def largestValues(self, root: Optional[TreeNode]) -> List[int]:
    def largestValues(self, root: TreeNode) -> List[int]:
        # BFS Algorithm #
        queue = []
        queue.append(root)
        res = []
        
        if root is None:
            return []
        while len(queue) != 0:
            ans  = []
            for i in range(len(queue)):
                node_val  = queue.pop(0)
                ans.append(node_val.val)
                if node_val.left:
                    queue.append(node_val.left)
                if node_val.right:
                    queue.append(node_val.right)
            res.append(max(ans))
        return res
        