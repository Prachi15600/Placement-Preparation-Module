class Solution {
public:
    bool rotateString(string s, string goal) {
        if(goal.length() != s.length()) return false;
        string str = s+s;
        if(str.find(goal) != string::npos){
            return true;
        }
        return false;
    }
};