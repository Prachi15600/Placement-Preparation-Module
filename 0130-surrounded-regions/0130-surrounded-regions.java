class Solution {
    public void dfs(int row, int col, int[][] vis, char[][] board, int[] delrow, int[] delcol) {
        vis[row][col] = 1;
        int n = board.length;
        int m = board[0].length;

        //check for top right bottom left
        for(int i=0; i<4; i++) {
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];
            if(nrow >= 0 && nrow<n && ncol>=0 && ncol<m && board[nrow][ncol] == 'O' && vis[nrow][ncol] == 0) {
                dfs(nrow, ncol, vis, board, delrow, delcol);
            }
        }
    }
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        int[] delrow = {-1, 0, 1, 0};
        int[] delcol = {0, 1, 0, -1};
        int vis[][] = new int[n][m];

        // first row and last row traversal
        for(int j=0; j<m; j++) {
            // first row
            if(vis[0][j] == 0 && board[0][j] == 'O') {
                dfs(0, j, vis, board, delrow, delcol);
            }
            // last row
            if(vis[n-1][j] == 0 && board[n-1][j] == 'O') {
                dfs(n-1, j, vis, board, delrow, delcol);
            }
        }

        //first col and last col traversal
        for(int i=0; i<n; i++) {
            //first col
            if(vis[i][0] == 0 && board[i][0] == 'O') {
                dfs(i, 0, vis, board, delrow, delcol);
            }
            //last col
            if(vis[i][m-1] == 0 && board[i][m-1] == 'O') {
                dfs(i, m-1, vis, board, delrow, delcol);
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(vis[i][j] == 0 && board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }
}