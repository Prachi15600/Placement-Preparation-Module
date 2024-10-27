class Solution {
    public int maxProduct(int[] nums) {
        int pre = 1, suf = 1, n = nums.length;
        int MAX = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++) {
            if(pre == 0) pre=1;
            if(suf == 0) suf=1;
            
            pre *= nums[i];
            suf *= nums[n-i-1];
            
            MAX = Math.max(MAX, Math.max(pre,suf));
        }
        return MAX;
    }
}