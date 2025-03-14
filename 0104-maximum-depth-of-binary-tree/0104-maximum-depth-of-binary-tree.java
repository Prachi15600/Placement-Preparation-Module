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
        Queue<TreeNode> q = new LinkedList<>();
        int count = 0;
        if(root == null) return count;
        // List<List<Integer>> res = new ArrayList<>();
        q.offer(root);
        
        while(!q.isEmpty()) {
            int n = q.size();
            // List<Integer> subList = new ArrayList<>();

            for(int i=0; i<n; i++) {
                if(q.peek().left != null) q.offer(q.peek().left);
                if(q.peek().right != null) q.offer(q.peek().right);
                // subList.add(q.poll().val);
                q.poll();
            }

            count++;
            // res.add(subList);
        }
        return count;
    }
}