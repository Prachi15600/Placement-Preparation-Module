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
    public int maxDepth(TreeNode root) {
        //int[] res = new int[1];
        return helper(root);
        
    }

    int helper(TreeNode root) {
        if(root == null) return 0;
        int lh = helper(root.left);
        int rh = helper(root.right);

        return Math.max(lh, rh) + 1;
    }
}