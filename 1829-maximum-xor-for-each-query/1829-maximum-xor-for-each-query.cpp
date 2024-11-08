class Solution {
public:
    vector<int> getMaximumXor(vector<int>& nums, int maximumBit) {
        int n = nums.size();
        vector<int> arr(n);
        int XOR = 0;
            
        for(int j =0; j< n; j++) {
                XOR = XOR ^ nums[j];
        }
        
        int mask = (1<<maximumBit) - 1;
        
        for(int x=0; x<n; x++) {
            int k = XOR ^ mask;
            arr[x] = k;
            XOR = XOR ^ nums[n-x-1];
                
        }
        
        
        
        return arr;
    }
};