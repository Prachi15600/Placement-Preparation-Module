class Solution {
public:
    int sumOddLengthSubarrays(vector<int>& arr) {
        int sum=0;
        int l = arr.size();
        for(int i=0; i<l; i++){
            for(int j=i; j<l; j=j+2){
                for(int k=i; k<j+1; k++){
                    sum = sum+arr[k];
                }
            }
        }
        return sum;
    }
};