class Solution {
public:
    int minAddToMakeValid(string s) {
        int open = 0, close = 0;
        int n = s.size();
        
        for(int i=0; i< n; i++) {
            if(s[i] == '(') {
                open++;
            }
            
            else if(s[i] == ')') {
                if(open > 0) {
                    open--;
                }
                else {
                    close++;
                }
            }
        }
        return open+close;
    }
};