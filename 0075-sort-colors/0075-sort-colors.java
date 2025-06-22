class Solution {
    public void sortColors(int[] nums) {
        int color0 = 0;
        int color1 = 0;
        int color2 = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) color0++;
            else if(nums[i] == 1) color1++;
            else color2++;
        }

        for(int i=0; i<color0; i++) {
            nums[i] = 0;
        }

        for(int i=color0; i<color1+color0; i++) {
            nums[i] = 1;
        }

        for(int i=color1+color0; i<nums.length; i++) {
            nums[i] = 2;
        }
    }
}