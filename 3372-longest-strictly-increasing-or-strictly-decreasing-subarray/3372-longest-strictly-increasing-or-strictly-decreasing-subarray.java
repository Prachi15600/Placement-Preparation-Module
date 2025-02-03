class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int count1 = 1, count2 = 1, maxIn = Integer.MIN_VALUE, maxDe = Integer.MIN_VALUE;
        if(nums.length == 1) return count1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i-1] < nums[i]) {
                count2 = 1;
                count1++;
            }
            else if(nums[i-1] > nums[i]) {
                count1 = 1;
                count2++;
            }
            else {
                count1 = 1;
                count2 = 1;
            }
            maxIn = Math.max(maxIn, count1);
            maxDe = Math.max(maxDe, count2);
        }

        return Math.max(maxIn, maxDe);
    }
}