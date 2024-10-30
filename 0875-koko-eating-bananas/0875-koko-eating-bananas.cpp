class Solution {
public:
    
    int findMax(vector<int>& piles) {
        int maxi = INT_MIN;
        for(int i=0; i<piles.size(); i++) {
            maxi = max(maxi, piles[i]);
        }
        return maxi;
    }
    
    int calculateTotalHours(int h, vector<int>& piles, int m) {
        long res = 0;
        for(int i : piles) {
            res += (i + m - 1) / m;
        }
        return res<=h;
    }
    
    int minEatingSpeed(vector<int>& piles, int h) {
        int l = 1, hi = findMax(piles), res = INT_MAX;
        while(l<=hi) {
            int m = (l+hi) / 2;
                        
            if(calculateTotalHours(h, piles, m)) {
                res = min(res, m);
                hi = m-1;
            }
            else{
                l = m+1;
            }
        }
        return res;
    }
};