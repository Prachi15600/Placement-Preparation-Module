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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();

        List<Integer> res = new ArrayList<>();

        if(root == null) return res;

        st1.push(root);
        while(!st1.isEmpty()) { 
            TreeNode ele = st1.pop();
            st2.push(ele);
            if(ele.left != null) st1.push(ele.left);
            if(ele.right != null) st1.push(ele.right);
        }
        while(!st2.isEmpty()) {
            res.add(st2.pop().val);
        }
        return res;
    }
    
}