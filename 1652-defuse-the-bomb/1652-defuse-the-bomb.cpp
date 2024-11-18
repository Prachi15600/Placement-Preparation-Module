class Solution {
public:
    vector<int> decrypt(vector<int>& code, int k) {
        int n = code.size();
        vector<int> res(n, 0);
        
        int sum = 0;
        if(k == 0) {
            return res;
        }
        
        int i = -1, j = -1;
        if(k>0) {
            i = 1; 
            j = k;
        }
        
        else if(k<0) {
            i=n-abs(k);
            j=n-1;
        }
        
        for(int p=i; p<=j; p++) {
            sum += code[p];
        }
        
        for(int x=0; x<n; x++) {
            res[x] = sum;
            sum -= code[i % n];
            i++;
            
            sum += code[(j+1)%n];
            j++;
        }
        
        return res;
    }
};