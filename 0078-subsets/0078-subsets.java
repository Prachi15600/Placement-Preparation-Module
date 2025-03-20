class Solution {
    List<List<Integer>> res = new ArrayList<>();

    void solve(int[] nums, int i, List<Integer>subList) {
        if(i>=nums.length) {
            res.add(new ArrayList<>(subList));
            return;
        }

        subList.add(nums[i]);
        solve(nums, i+1, subList);
        subList.remove(subList.size()-1);
        solve(nums, i+1, subList);
        
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>subList = new ArrayList<>();
        solve(nums, 0, subList);
        return res;
    }
}