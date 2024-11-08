class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int[] arr = new int[n];
        int XOR =0;
        for(int i =0; i<n; i++) {
            XOR ^= nums[i];
        }
        
        int mask = (1<<maximumBit) - 1;
        
        for(int i=0; i<n; i++) {
            int k = XOR ^ mask;
            arr[i] = k;
            XOR ^= nums[n-i-1];
        }
        
        return arr;
    }
}