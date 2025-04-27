class Triplet {
    int first, second, third;
    Triplet(int first, int second, int third) {
        this.first = first ;
        this.second = second;
        this.third = third;
    }
}

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int vis[][] = new int[n][m];
        int dist[][] = new int[n][m];
        Queue<Triplet> q = new LinkedList<>();
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(mat[i][j] == 0){
                    q.add(new Triplet(i,j,0));
                    vis[i][j] = 1;
                }
                else {
                    vis[i][j] = -1;
                }
            }
        }

        int delrow[] = {-1, 0, 1, 0};
        int delcol[] = {0, 1, 0, -1};

        while(!q.isEmpty()) {
            int row = q.peek().first;
            int col = q.peek().second;
            int step = q.peek().third;
            q.remove();
            dist[row][col] = step;

            for(int i=0; i<4; i++) {
                int nrow = delrow[i] + row;
                int ncol = delcol[i] + col;

                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol] == -1) {
                    vis[nrow][ncol] = 1;
                    q.add(new Triplet(nrow, ncol, step+1));
                }
            }
        }
        return dist;
    }
}