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
    public boolean findTarget(TreeNode root, int k) {
        return traverse(root, root, k);
    }

    boolean traverse(TreeNode root, TreeNode curr, int k) {
        if(curr == null) return false;
        int findNum = k - curr.val;
        if(helper(root, curr, findNum))  {
            return true;
        }
        return traverse(root, curr.left, k) || traverse(root, curr.right, k);
    }

    boolean helper(TreeNode root, TreeNode curr, int findNum) {
        while(root != null) {
            if(root.val < findNum) {
                root = root.right;
            }
            else if(root.val > findNum) {
                root = root.left;
            }
            else {
                if(root != curr) return true;
                return false;
            }
        }
        return false;
    }
}