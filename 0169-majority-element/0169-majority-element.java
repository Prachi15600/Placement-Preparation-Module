class Solution {
    public int majorityElement(int[] nums) {
        
        int n = nums.length;
        int majority = n/2;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<n; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }

        for(int i=0; i<n; i++) {
            if(hm.get(nums[i]) > majority) {
                return nums[i];
            }
        }
        return 0;

    }
}