import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;

        // Step 1: Find the first decreasing element from the right
        for (int i = n - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                index = i - 1;
                break;
            }
        }

        // Step 2: If such an element is found, swap it with the next larger element
        if (index != -1) {
            int swapIndex = -1;
            for (int i = n - 1; i > index; i--) {
                if (nums[i] > nums[index]) {
                    swapIndex = i;
                    break;
                }
            }

            // Swap elements
            int temp = nums[index];
            nums[index] = nums[swapIndex];
            nums[swapIndex] = temp;
        }

        // Step 3: Reverse the portion after index to get the next lexicographical order
        reverse(nums, index + 1, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
