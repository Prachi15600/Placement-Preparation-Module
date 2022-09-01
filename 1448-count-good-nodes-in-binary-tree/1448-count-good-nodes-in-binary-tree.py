# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def goodNodes(self, root: TreeNode) -> int:        
        res = self.dfs(root, root.val)
        return res
    
    def dfs(self, root, maxVal):
        if not root:
            return 0
        
        maxVal = max(maxVal, root.val)
        
        left = self.dfs(root.left, maxVal)
        right = self.dfs(root.right, maxVal)
        
        res = left + right
        
        if root.val >= maxVal:
            res += 1
            
        return res
        