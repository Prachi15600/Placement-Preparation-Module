class Pair {
    int first;
    int second;
    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
class Solution {

    public void bfs(int i, int j, int[][]vis, char[][] grid, int n, int m) {
        vis[i][j] = 1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i, j));

        while(!q.isEmpty()) {
            int row = q.peek().first;
            int col = q.peek().second;
            q.remove();
            int[] delrow = {-1, 0, 1, 0};
            int[] delcol = {0, 1, 0, -1};
            for(int k = 0; k < 4; k++) {
                int nrow = delrow[k] + row;
                int ncol = delcol[k] + col;
                if(nrow>=0 &&nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol] == 0 && grid[nrow][ncol] == '1') {
                    vis[nrow][ncol] = 1;
                    q.add(new Pair(nrow, ncol));
                }
                
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int count = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(grid[i][j]=='1' && vis[i][j] == 0) {
                    count++;
                    bfs(i, j, vis, grid, n, m);
                }
            }
        }
        return count;
    }
}