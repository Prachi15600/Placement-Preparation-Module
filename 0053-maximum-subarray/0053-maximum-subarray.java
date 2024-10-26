class Solution {
    public int maxSubArray(int[] nums) {
        int MAX = Integer.MIN_VALUE, sum =0, n = nums.length;
        
        for(int i=0; i<n; i++) {
            sum += nums[i];
            MAX = Math.max(MAX, sum);
            
            if(sum<0) {
                sum = 0;
            }
        }
        
        return MAX;
    }
}