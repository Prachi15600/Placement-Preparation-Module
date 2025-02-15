class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int pre =1, suff = 1;
        int Max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++) {
            if(pre == 0) pre = 1;
            if(suff == 0) suff = 1;

            pre = pre * nums[i];
            suff = suff * nums[n-i-1];
            Max = Math.max(Max, Math.max(pre, suff));
        }

        return Max;
    }
}