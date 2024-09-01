class Solution {
public:
  vector<vector<int>> construct2DArray(vector<int>& orig, int m, int n) {   
    if(orig.size() == m*n){
      vector<vector<int>> ans (m, vector<int>(n));
      for(int y = 0, i = 0; y != m; y++)
        for(int x = 0; x!= n; x++) ans[y][x] = orig[i++];
      return ans;
    }
      
    return {};  
  }
};