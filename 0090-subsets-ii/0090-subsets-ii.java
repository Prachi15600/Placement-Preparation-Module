class Solution {
    void helper(int[] nums, List<List<Integer>> res, List<Integer> ds, int idx) {
        res.add(new ArrayList<>(ds));
        for(int i=idx; i<nums.length; i++) {
            if(i!=idx && nums[i] == nums[i-1]) continue;
            ds.add(nums[i]);
            helper(nums, res, ds, i+1);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        helper(nums, res, new ArrayList<>(), 0);
        return res;
    }
}