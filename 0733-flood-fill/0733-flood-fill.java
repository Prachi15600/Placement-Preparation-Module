class Solution {
    public void dfs(int sr, int sc, int[][] image, int color, int iniColor, int delRow[], int delCol[], int[][] ans) {
        ans[sr][sc] = color;
        int n = image.length;
        int m = image[0].length;

        for(int i=0; i<4; i++) {
            int row = sr + delRow[i];
            int col = sc + delCol[i];
            if(row>=0 && row<n && col>=0 && col<m && image[row][col] == iniColor && ans[row][col] != color) {
                dfs(row, col, image, color, iniColor, delRow, delCol, ans);
            }
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] ans = image;
        int iniColor = image[sr][sc];
        int delRow[] = {-1, 0, 1, 0};
        int delCol[] = {0, 1, 0, -1};
        dfs(sr, sc, image, color, iniColor, delRow, delCol, ans);
        return ans;
    }
}