class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        int i=0;
        while (nums[i] > 0){
            int tmp = nums[i];
            nums[i] = 0;
            i = tmp;
        }
        return i;
    }
};