class Solution {
    public int countPath(int i, int j, int m, int n, ArrayList<ArrayList<Integer>> dp) {
        if(i==(m-1) && j==(n-1)) return 1;
        if(i>=m || j>=n) return 0;
        if(dp.get(i).get(j) != -1) return dp.get(i).get(j);
        int right = countPath(i, j+1, m, n, dp);
        int down = countPath(i+1, j, m, n, dp);
        dp.get(i).set(j, right+down);
        return dp.get(i).get(j);
    }

    public int uniquePaths(int m, int n) {
        ArrayList<ArrayList<Integer>> dp = new ArrayList<>();
        for(int i=0; i<m; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0; j<n; j++) {
                row.add(-1);
            }
            dp.add(row);
        }
        return countPath(0, 0, m, n, dp);
    }
}