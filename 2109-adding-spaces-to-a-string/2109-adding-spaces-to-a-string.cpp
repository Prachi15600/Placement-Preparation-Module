class Solution {
public:
    string addSpaces(string s, vector<int>& spaces) {
        int n = s.size();
        int m = spaces.size();
        int i=0, j=0;
        string st = "";
        while(i<n && j<m) {
            if(i != spaces[j]) {
                st += s[i];
                i++;
            }
            
            else if(i == spaces[j]) {
                st += ' ';
                //st += s[i];
                j++;
            }
        }
        
        while(i<n) {
            st += s[i];
            i++;
        }
        return st;
    }
};