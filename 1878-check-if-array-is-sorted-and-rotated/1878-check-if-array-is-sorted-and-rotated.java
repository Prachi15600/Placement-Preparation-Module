class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2*n];
        int m = arr.length;
        System.arraycopy(nums, 0, arr, 0, n);
        System.arraycopy(nums, 0, arr, n, n);
        int count = 1;
        if(n==1) return true;
        for(int i=1; i<m; i++) {
            if(arr[i-1] <= arr[i]) {
                count++;
                if(count == nums.length) return true;
            }
            else if(count == nums.length) return true;
            else count = 1;
        }

        return false;
    }
}