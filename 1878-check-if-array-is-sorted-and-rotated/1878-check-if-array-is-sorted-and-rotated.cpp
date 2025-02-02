class Solution {
public:
    bool check(vector<int>& nums) {
        vector<int> arr = nums;
        arr.insert(arr.end(), arr.begin(), arr.end());
        
        for(int i=0; i<nums.size(); i++) {
            bool isSorted = true;
            for(int j=i+1; j<i+nums.size(); j++) {
                if(arr[j] < arr[j-1]) {
                    isSorted = false;
                    break;
                }
            }
            if(isSorted) return true;
        }

       
        return false;
    }
};