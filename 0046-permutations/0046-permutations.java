class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, new ArrayList<>(), used, result);
        return result;
    }

    private void backtrack(int[] nums, List<Integer> curr, boolean[] used, List<List<Integer>> result) {
        if (curr.size() == nums.length) {
            result.add(new ArrayList<>(curr));  // Make a copy of the current permutation
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;

            // Choose
            used[i] = true;
            curr.add(nums[i]);

            // Explore
            backtrack(nums, curr, used, result);

            // Un-choose (Backtrack)
            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }
}
