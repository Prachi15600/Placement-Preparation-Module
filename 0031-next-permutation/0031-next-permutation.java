class Solution {
public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;

     
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        
        if (index == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        
        for (int i = n - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                // Swap nums[index] and nums[i]
                swap(nums, i, index);
                break;
            }
        }

        reverse(nums, index + 1, n - 1);
    }

    // Helper method to reverse a portion of the array
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    // Helper method to swap two elements in the array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}