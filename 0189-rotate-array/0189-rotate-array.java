class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        if(k>n) return;
        int[] arr = new int[2*n];
        System.arraycopy(nums, 0, arr, 0, n);
        System.arraycopy(nums, 0, arr, n, n);
        int j=0;
        for(int i=n-k; i<arr.length-k; i++) {
            nums[j++] = arr[i];
        }

        
    }
}