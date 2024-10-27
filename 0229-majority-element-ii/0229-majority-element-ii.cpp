class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        vector<int> ans;
        int cnt1 = 0, cnt2 = 0;
        int n = nums.size();
        int el1 = INT_MIN, el2 = INT_MIN;
        
        for(int i=0; i<n; i++) {
            if(cnt1 == 0 && el2 != nums[i]) {
                cnt1 = 1;
                el1 = nums[i];
            }
            
            else if(cnt2 == 0 && el1 != nums[i]) {
                cnt2 = 1;
                el2 = nums[i];
            }
            
            else if(el1 == nums[i]) cnt1++;
            else if(el2 == nums[i]) cnt2++;
            
            else  {
                cnt1--;
                cnt2--;
                
            }
            
        }
        
        cnt1 = 0, cnt2 = 0;
        
        for(int i=0; i<n; i++) {
            if(el1 == nums[i]) cnt1++;
            if(el2 == nums[i]) cnt2++;
        }
        
        if(cnt1 > n/3) {
            ans.push_back(el1);
        }
        
        if(cnt2 > n/3) {
            ans.push_back(el2);
        }
        
        return ans;
        
    }
};