class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        generateSubset(nums, res, new ArrayList<>(), 0);
        return res;
    }

    void generateSubset(int[] nums, List<List<Integer>> res, List<Integer> subList, int index) {
    
        res.add(new ArrayList<>(subList));     

        for(int i=index; i<nums.length; i++) {
            if(i>index && nums[i]==nums[i-1]) continue;

            subList.add(nums[i]);
            generateSubset(nums, res, subList, i+1);
            subList.remove(subList.size() - 1);
        }
    }
}