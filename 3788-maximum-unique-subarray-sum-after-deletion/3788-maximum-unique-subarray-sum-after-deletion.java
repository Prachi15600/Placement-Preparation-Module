class Solution {
    public int maxSum(int[] nums) {
        int sum = 0;
        int neg = Integer.MIN_VALUE;
        int maxi = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        int flag = 0;

        for(int i=0; i<nums.length; i++) {
            if(!set.contains(nums[i]) || set.isEmpty()) {
                set.add(nums[i]);

                if(nums[i] >= 0) {
                    sum += nums[i];
                    if(nums[i] == 0) flag = 1;
                }
                
                if(nums[i] < 0) {
                    neg = Math.max(neg, nums[i]);
                }
            }
            

        }

        if(sum == 0 && flag == 0) return neg;
        return sum;
    }
}