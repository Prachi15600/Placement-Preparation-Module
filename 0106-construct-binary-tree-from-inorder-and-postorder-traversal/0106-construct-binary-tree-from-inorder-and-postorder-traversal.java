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
    private HashMap<Integer, Integer> inorderMap;
    private int postIndex;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        // Edge case: if arrays are empty
        if (inorder == null || postorder == null || inorder.length != postorder.length) {
            return null;
        }
        
        // Store inorder indices in HashMap for quick lookup
        inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        // Start from the last element in postorder (root of the tree)
        postIndex = postorder.length - 1;

        // Build the tree recursively
        return buildTreeHelper(postorder, 0, inorder.length - 1);
    }

    private TreeNode buildTreeHelper(int[] postorder, int inStart, int inEnd) {
        // Base case: if inStart > inEnd, no elements to construct the subtree
        if (inStart > inEnd) {
            return null;
        }

        // Get the current root from postorder
        int rootVal = postorder[postIndex--];
        TreeNode root = new TreeNode(rootVal);

        // Find root position in inorder
        int inIndex = inorderMap.get(rootVal);

        // **Important**: Process right subtree first, then left (postorder is L-R-Root)
        root.right = buildTreeHelper(postorder, inIndex + 1, inEnd);
        root.left = buildTreeHelper(postorder, inStart, inIndex - 1);

        return root;
    }
}