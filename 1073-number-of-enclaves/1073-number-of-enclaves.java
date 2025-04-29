class Solution {

    public void dfs(int row, int col, int[][] vis, int[][] grid, int[] delrow, int[] delcol, int n, int m) {
        vis[row][col] = 1;

        for(int i=0; i<4; i++) {
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];

            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1) {
                dfs(nrow, ncol, vis, grid, delrow, delcol, n, m);
            }
        }
    }
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int vis[][] = new int[n][m];
        int[] delrow = {-1, 0, 1, 0};
        int[] delcol = {0, 1, 0, -1};
        // first and last row traversal
        for(int j=0; j<m; j++) {
            // first row
            if(grid[0][j] == 1 && vis[0][j] == 0) {
                dfs(0, j, vis, grid, delrow, delcol, n, m);
            }

            // last row
            if(grid[n-1][j] == 1 && vis[n-1][j] == 0) {
                dfs(n-1, j, vis, grid, delrow, delcol, n, m);
            }
        }

        // first and last col traversal
        for(int i=0; i<n; i++) {
            // first col
            if(grid[i][0] == 1 && vis[i][0] == 0) {
                dfs(i, 0, vis, grid, delrow, delcol, n, m);
            }
            // last col
             if(grid[i][m-1] == 1 && vis[i][m-1] == 0) {
                dfs(i, m-1, vis, grid, delrow, delcol, n, m);
            }
        }
        int count = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(vis[i][j] == 0 && grid[i][j] == 1) {
                    count++;
                }
            }
        }

        return count; 
    }
}