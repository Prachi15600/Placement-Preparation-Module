class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 1;
        int count0 = 0;
        int mx = 0;
        int n = nums.length;
        if(n == 1 && nums[0] == 1) return count;
        if(n == 1 && nums[0] == 0) return 0;
        if(nums[0] == 0) count0++;
        for(int i=1; i<n; i++) {
            if(nums[i-1] == 1 && nums[i] == 1) {
                count++;
            }
            else {
                count = 1;
                if(nums[i] == 0) count0++;
            }
            mx = Math.max(mx, count);
        }
        if(count0 == n) return 0;
        return mx;
    }
}