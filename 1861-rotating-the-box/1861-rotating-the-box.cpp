class Solution {
public:
    vector<vector<char>> rotateTheBox(vector<vector<char>>& box) {
        int m = box.size();
        int n = box[0].size();
        vector<vector<char>> res(n, vector<char>(m));
        
        for(int i=0; i<n; i++) {
            for(int j =0; j<m; j++) {
                res[i][j] = box[j][i];
            }
        }
        
        for(vector<char>& row:res) {
            reverse(begin(row), end(row));
        }
        
        for(int j=0; j<m; j++) {
            for(int i=n-1; i>=0; i--) {
                if(res[i][j] == '.') {
                    int stone = -1;
                    
                    for(int k = i-1; k>=0; k--) {
                        if(res[k][j] == '*') break;
                        else if(res[k][j] == '#'){
                            stone = k;
                            break;
                        }
                    }
                    
                    if(stone != -1) {
                        res[i][j] = '#';
                        res[stone][j] = '.';
                    }
                }
            }
        }
        
        
        
        return res;
    }
};