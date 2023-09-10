class Solution {
public:
    int MOD = 1e9 + 7;
    int countOrders(int n) {
        long places = 2 * n;
        long seq = 1;
        for(int i=0; i<n; i++) {
            seq = (seq * ((places * (places - 1)))/2) % MOD;
            places = places - 2;
        }
        
        return (int)seq;
    }
};