class Solution:
    def validateBinaryTreeNodes(self, n: int, leftChild: List[int], rightChild: List[int]) -> bool:
        class TreeNode:
            def __init__(self,value):
                self.val = value
                self.left = None
                self.right = None
        nodearr = []
        nodes = set()
        for i in range(n):
            nodes.add(i)
            nodearr.append(TreeNode(i))
        for p,lc in enumerate(leftChild):
            if lc!=-1:
                nodearr[p].left = nodearr[lc]
            if lc in nodes:
                nodes.remove(lc)
        for p,rc in enumerate(rightChild):
            if rc!=-1:
                nodearr[p].right = nodearr[rc]
            if rc in nodes:
                nodes.remove(rc)
        vis = [0]*n
        def traverse(root):
            if root==None:
                return 
            vis[root.val]+=1
            if vis[root.val]>1:
                return
            traverse(root.left),traverse(root.right)
        if len(nodes)!=1:
            return False
        for s in nodes:
            traverse(nodearr[s])
        for i in range(n):
            if vis[i]!=1:
                return False
        return True