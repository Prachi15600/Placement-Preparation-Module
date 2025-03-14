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
        int[] maxi = new int[]{Integer.MIN_VALUE};
        helper(root, maxi);
        return maxi[0];
    }

    public int helper(TreeNode root, int[] maxi) {
        if(root == null) return 0;
        int lv = Math.max(0,helper(root.left, maxi));
        int rv = Math.max(0,helper(root.right, maxi));

        maxi[0] = Math.max(maxi[0], lv+rv+root.val);
        return root.val + Math.max(lv,rv);
    }
}