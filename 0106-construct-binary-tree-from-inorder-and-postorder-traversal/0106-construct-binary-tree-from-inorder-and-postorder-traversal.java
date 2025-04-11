class Solution {
    int postIndex;
    Map<Integer, Integer> inorderMap = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length - 1;

        // Store the index of each value in inorder for O(1) lookup
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return build(inorder, postorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] inorder, int[] postorder, int inStart, int inEnd) {
        if (inStart > inEnd) return null;

        int rootVal = postorder[postIndex--];
        TreeNode root = new TreeNode(rootVal);

        int inIndex = inorderMap.get(rootVal);

        // Build right subtree first, then left subtree
        root.right = build(inorder, postorder, inIndex + 1, inEnd);
        root.left = build(inorder, postorder, inStart, inIndex - 1);

        return root;
    }
}
