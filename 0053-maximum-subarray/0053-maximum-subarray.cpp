class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int MAX = INT_MIN, sum = 0;
        int n = nums.size();
        // MAX = max(MAX, sum);
        
        for(int i = 0; i<n; i++) {
            sum = sum + nums[i];
            MAX = max(MAX, sum);
            
            if(sum < 0) {
                sum = 0;
            }
        }
        
        return MAX;
    }
};