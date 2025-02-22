class Solution {
    void subsetsHelper(int[] nums, List<Integer> temp, Set<List<Integer>> res, int index, int n) {
        if(index == n) {
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[index]);
        subsetsHelper(nums, temp, res, index+1, n);
        temp.remove(temp.size()-1);
        subsetsHelper(nums, temp, res, index+1, n);

    } 

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        //List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> res = new HashSet<>();
        int n = nums.length;
        subsetsHelper(nums, new ArrayList<>(), res, 0, n);
        //set.addAll(res);
        return new ArrayList<>(res);
    }
}