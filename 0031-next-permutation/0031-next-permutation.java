class Solution {
    public void nextPermutation(int[] nums) {
        // 2 1 5 4 3 0 0 , 2 3 0 0 1 4 5
        int n = nums.length;
        int breakPoint = -1;
        for(int i=n-2; i>=0; i--) {
            if(nums[i] < nums[i+1]) {
                breakPoint = i;
                break;
            }
        }

        if(breakPoint != -1) {
            for(int i=n-1; i>breakPoint; i--) {
                if(nums[i] > nums[breakPoint]) {
                    int temp = nums[breakPoint];
                    nums[breakPoint] = nums[i];
                    nums[i] = temp;
                    break;
                }

            }

            
        }
        reverse(nums, breakPoint+1, n-1);


    }

    private void reverse(int[] nums, int left, int right) {
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}