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
    public int maxPathSum(TreeNode root) {
        int[] res = new int[]{Integer.MIN_VALUE};
        helper(root, res);
        return res[0];
    }

    int helper(TreeNode root, int[] res) {
        if(root == null) return 0;
        
        // Ignore negative path sums
        int lh = Math.max(0, helper(root.left, res));
        int rh = Math.max(0, helper(root.right, res));

        // Update the maximum path sum including the current node
        res[0] = Math.max(lh + rh + root.val, res[0]);

        // Return max path sum from the current node down
        return root.val + Math.max(lh, rh);
    }
}