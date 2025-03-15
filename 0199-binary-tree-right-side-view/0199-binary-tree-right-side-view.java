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
    class Pair{
        int hd;
        TreeNode node;
        Pair(int hd, TreeNode node) {
            this.hd = hd;
            this.node = node;
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        if(root == null) return res;
        q.offer(new Pair(0, root));

        while(!q.isEmpty()) {
            Pair curr = q.poll();
            
            map.put(curr.hd, curr.node.val);

            if(curr.node.left != null) {
                q.offer(new Pair(curr.hd+1, curr.node.left));
            }            

            if(curr.node.right != null) {
                q.offer(new Pair(curr.hd+1, curr.node.right));
            }
            
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            res.add(entry.getValue());
        }

        return res;
    }
}