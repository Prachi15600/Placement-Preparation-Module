class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int majorityEle = n / 2;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<n; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        for(int key : hm.keySet()) {
            if(hm.get(key) > majorityEle) {
                return key;
            }
        }
        return 0;
    }
}