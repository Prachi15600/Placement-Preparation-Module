class Solution {
    public void nextPermutation(int[] nums) {
        // 2 1 5 4 3 0 0 , 2 3 0 0 1 4 5
        int n = nums.length;
        int index = -1;
        for(int i=n-1; i>0; i--) {
            if(nums[i-1] < nums[i]) {
                index = i-1;
                break;
            }
        }

        if(index != -1) {
            int justGreater = -1;
            for(int i=n-1; i>index; i--) {
                if(nums[i] > nums[index]) {
                    justGreater = i;
                    break;
                }
            }
            int temp = nums[index];
            nums[index] = nums[justGreater];
            nums[justGreater] = temp;


        }

        reverse(nums, index+1, n-1);
    }

    void reverse(int nums[], int l, int r) {
        while(l < r) {
            int temp =  nums[l];
            nums[l] = nums[r] ;
            nums[r] = temp;
            l++;
            r--;
        }
    }

}