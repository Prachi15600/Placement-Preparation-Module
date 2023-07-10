class Solution {
public:
    int minimumSum(int num) {
        vector<int> d;
        int new1,new2,res;
        while(num>0){
            d.push_back(num%10);
            num = num/10;
            
        }
        sort(begin(d), end(d));
        new1 = 10*d[0]+d[2];
        new2 = 10*d[1]+d[3];
        return new1 + new2;
    }
};