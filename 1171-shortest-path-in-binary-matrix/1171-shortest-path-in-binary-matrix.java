class Triplet {
    int row, col, dist;
    Triplet(int row, int col, int dist) {
        this.row = row;
        this.col = col;
        this.dist = dist;
    }
}

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        
        if(grid[0][0] != 0 || grid[n-1][n-1] != 0 ) return -1;
        int[][] directions = {
            {-1,-1}, {-1,0}, {-1, 1}, {0,-1},
            {0, 1}, {1,-1}, {1, 0}, {1, 1}
        };
        Queue<Triplet> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];

        q.add(new Triplet(0, 0, 1));
        visited[0][0] = true;

        while(!q.isEmpty()) {
            Triplet curr = q.poll();

            if(curr.row == n-1 && curr.col ==n-1) {
                return curr.dist;
            }

            for(int[] dir : directions) {
                int newRow = curr.row + dir[0];
                int newCol = curr.col + dir[1];

                if(newRow >= 0 && newCol >= 0 && newRow < n && newCol <n && grid[newRow][newCol] == 0 && !visited[newRow][newCol]) {
                    q.add(new Triplet(newRow, newCol, curr.dist+1));
                    visited[newRow][newCol] = true;
                }
            }
        }
        return -1;
    }
}