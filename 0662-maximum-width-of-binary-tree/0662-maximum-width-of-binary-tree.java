/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    class Pair {
        TreeNode node;
        int num;
        Pair(TreeNode node, int num) {
            this.node = node;
            this.num = num;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int maxW = 0;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        while(!q.isEmpty()) {
            int n = q.size();
            
            int l = q.peek().num;
            int r = 0;

            for(int i=0; i<n; i++) {
                Pair curr = q.poll();
                if(i==n-1) r = curr.num;

                if(curr.node.left != null) q.add(new Pair(curr.node.left, 2*curr.num+1));
                if(curr.node.right != null) q.add(new Pair(curr.node.right, 2*curr.num+2));
            }
            maxW = Math.max(maxW, r-l+1);
        }
        return maxW;
    }
}