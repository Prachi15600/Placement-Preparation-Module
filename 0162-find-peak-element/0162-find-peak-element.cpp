class Solution {
public:
    int findPeakElement(vector<int>& nums) {
        int n  = nums.size();
        int l =1, h =n-2;
        if(n==1) return 0;
        else if(nums[0] > nums[1]) {
            return 0;
        }
        
        else if(nums[n-1] > nums[n-2]) {
            return n-1;
        }
        while(l<=h) {
            int m = (l+h)/2;
            
            if(m == 0 || nums[m] > nums[m-1] && nums[m] > nums[m+1] || m == n-1) return m;
            else if (nums[m] > nums[m-1] && nums[m] < nums[m+1]) {
                l = m+1;
            }
            else {
                h = m-1;
            }
        }
        return -1;
    }
};