class Solution {
    public void nextPermutation(int[] nums) {
        // 2 1 5 4 3 0 0 , 2 3 0 0 1 4 5
        int bp = -1;
        for(int i=nums.length-1; i>0; i--) {
            if(nums[i] > nums[i-1]) {
                bp = i-1;
                break;
            }
        }

        if(bp != -1) {
            int nextGreater = -1;
            for(int i=nums.length-1; i>bp; i--) {
                if(nums[bp] < nums[i]) {
                    nextGreater = i;
                    break;
                }
            }

            int temp = nums[bp];
            nums[bp] = nums[nextGreater];
            nums[nextGreater] = temp;
        }

        reverse(bp+1, nums.length-1, nums);
    }

    public void reverse(int l, int r, int[] nums) {
        while(l<r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}