class Solution {
public:
    int repeatedStringMatch(string a, string b) {
        int n = a.size();
        int m = b.size();
        int count = 1;
        string str = a;
        
        while(str.size() < m) {
            str += a;
            count++;
        }
        
        if(str.find(b) != string::npos) {
            return count;
        }
        str += a;
        count++;
        
        if(str.find(b) != string::npos) {
            return count;
        }
        
        return -1;
    }
};