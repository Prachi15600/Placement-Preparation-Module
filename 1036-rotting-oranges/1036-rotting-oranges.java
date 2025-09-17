class Solution {
    class Pair {
        int i, j;
        Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        int freshOrange = 0;
        int n = grid.length;
        int m = grid[0].length;

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(grid[i][j] == 2) q.add(new Pair(i,j));
                if(grid[i][j] == 1) freshOrange++;
            }
        }

        if (freshOrange == 0) return 0;

        int time = 0;
        int[][] direction = {{-1,0}, {1,0}, {0,-1}, {0, 1}};

        while(!q.isEmpty()) {
            int size = q.size();
            while(size > 0) {
                Pair curr = q.poll();
                int i = curr.i;
                int j = curr.j;
                for(int[] dir : direction) {
                    int ni = i + dir[0];
                    int nj = j + dir[1];

                    if(ni>=0 && ni<n && nj>=0 && nj<m && grid[ni][nj] == 1) {
                        grid[ni][nj] = 2;
                        q.add(new Pair(ni, nj));
                        freshOrange--;
                    }
                }
                size--;
            }
            time++;
        }

        if(freshOrange == 0) return time-1;
        return -1;

    }
}