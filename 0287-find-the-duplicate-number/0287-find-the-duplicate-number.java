class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do{                      
            slow = nums[slow];                      //1,3,4,2,2   slow = 2
            fast = nums[nums[fast]];                //0,1,2,3,4   fast = 2
        }while(slow != fast);

        fast = nums[0];
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return fast;
    }
}