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
    public boolean isSameTree(TreeNode root1, TreeNode root2) {
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();

        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;

        q1.offer(root1);
        q2.offer(root2);
        

        while(!q1.isEmpty() && !q2.isEmpty()) {
            TreeNode curr1 = q1.poll();
            TreeNode curr2 = q2.poll();
            if(curr1.val != curr2.val) return false;
            
            if(curr1.left != null && curr2.left != null) {
                q1.offer(curr1.left);
                q2.offer(curr2.left);
            }
            else if(curr1.left != curr2.left) {
                return false;
            }

            if(curr1.right != null && curr2.right != null) {
                q1.offer(curr1.right);
                q2.offer(curr2.right);
            }
            else if(curr1.right != curr2.right) {
                return false;
            }
        }
        return q1.isEmpty() && q2.isEmpty();
    }
}