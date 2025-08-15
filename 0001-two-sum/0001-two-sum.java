class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int n = nums.length;
        int[] res = new int[2];
        for(int i=0; i<n; i++) {
            if(hmap.containsKey(target - nums[i])) {
                res[0] = i;
                res[1] = hmap.get(target - nums[i]);
            }
            hmap.put(nums[i], i);
        }
        return res;
    }
}