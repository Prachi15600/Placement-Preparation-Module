class Solution {
public:
    bool isCircularSentence(string s) {
        if(s.back() != s[0]) return false;
        
        int n = s.size();
        int i = 0;
        
        while(i<n) {
            while(i<n && s[i] != ' ') {
                i++;
            }
            
            if(i<n && s[i-1] != s[i+1]) return false;
            i++;
        }
        return true;
    }
};