class Solution {
public:
    int minOperations(vector<int>& nums) {
        int n=nums.size();
        sort(nums.begin(),nums.end());
        nums.erase(unique(nums.begin(),nums.end()),nums.end());
        int ans=INT_MAX;
        for(int i=0;i<nums.size();i++)
        {
            int val=nums[i]+n-1;
            int index=upper_bound(nums.begin(),nums.end(),val)-nums.begin();
            // cout<<index<<endl;
            ans=min(ans,n-(index-i));
        }
        return ans;
    }
};