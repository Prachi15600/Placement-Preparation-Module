class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        boolean[] result = new boolean[n+1];

        for(int i=0; i<n; i++) {
            result[nums[i]] = true;
        }

        for(int i=0; i<=n; i++) {
            if(result[i] == false) return i;
        }
        return -1;
    }
}