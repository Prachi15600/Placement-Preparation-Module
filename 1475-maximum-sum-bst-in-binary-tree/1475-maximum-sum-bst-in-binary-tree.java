class Solution {
    int maxSum = 0;

    public int maxSumBST(TreeNode root) {
        dfs(root);
        return maxSum;
    }

    // returns {isBST(1/0), min, max, sum}
    private int[] dfs(TreeNode node) {
        if (node == null) {
            return new int[]{1, Integer.MAX_VALUE, Integer.MIN_VALUE, 0}; // is BST, min, max, sum
        }

        int[] left = dfs(node.left);
        int[] right = dfs(node.right);

        boolean isBST = left[0] == 1 && right[0] == 1 &&
                        node.val > left[2] && node.val < right[1];

        if (isBST) {
            int sum = node.val + left[3] + right[3];
            maxSum = Math.max(maxSum, sum);
            return new int[]{
                1,
                Math.min(node.val, left[1]),
                Math.max(node.val, right[2]),
                sum
            };
        } else {
            return new int[]{0, 0, 0, 0}; // Not BST
        }
    }
}
