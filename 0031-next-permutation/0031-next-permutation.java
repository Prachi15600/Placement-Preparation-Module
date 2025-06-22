class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;

        for(int i=n-1; i>0; i--) {
            if(nums[i-1] < nums[i]) {
                index = i-1;
                break;
            }
        }
        if(index != -1) {
            int indexToSwap = -1;
            for(int i=n-1; i>index; i--) {
                if(nums[i] > nums[index]) {
                    indexToSwap = i;
                    break;
                }
            }
            int temp = nums[index];
            nums[index] = nums[indexToSwap];
            nums[indexToSwap] = temp;
        }

        

        reverse(nums, index+1, n-1);
    }

    private void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}