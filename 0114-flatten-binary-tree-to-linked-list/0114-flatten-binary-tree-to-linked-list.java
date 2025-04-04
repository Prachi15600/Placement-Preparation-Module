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
    TreeNode prev = null;
    public void flatten(TreeNode root) {
        helper(root);
    }

    void helper(TreeNode curr) {
        if(curr == null) return;

        helper(curr.right);
        helper(curr.left);

        curr.right = prev;
        curr.left = null;
        prev = curr;
    }
}