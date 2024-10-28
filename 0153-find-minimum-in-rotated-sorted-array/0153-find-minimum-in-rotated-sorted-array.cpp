class Solution {
public:
    int findMin(vector<int>& nums) {
        int n = nums.size();
        int l =0, h = n-1;
        int MIN = INT_MAX;
        
        while(l<=h) {
            int m = (l+h) / 2;
            if(nums[l] <= nums[h]) {
                MIN = min(MIN, nums[l]);
                break;
            }
            if(nums[l] <= nums[m] ) {
                MIN = min(MIN, nums[l]);
                l = m + 1;
            }
            
            else {
                MIN = min(MIN, nums[m]);
                h = m - 1;
            }
            
        }
        return MIN;
    }
};