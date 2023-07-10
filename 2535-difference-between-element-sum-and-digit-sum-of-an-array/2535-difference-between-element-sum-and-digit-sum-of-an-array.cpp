class Solution {
public:
    int differenceOfSum(vector<int>& nums) {
        int ele_sum = 0, dig_sum = 0,dig,i;
        for(i=0; i<nums.size(); i++){
            ele_sum = ele_sum + nums[i];
        
            int j = nums[i];
            while(j>0){
                dig = j%10;
                dig_sum = dig_sum + dig;
                j = j/10;
            }
        }
        
        return ele_sum - dig_sum;
        
    }
};