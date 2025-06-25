class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int arr[] = new int[n*n+1];
        int res[] = new int[2];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                arr[grid[i][j]]++;
            }
        }

        for(int i=1; i<n*n+1; i++) {
            if(arr[i]==0) {
                res[1] = i;
            }
            else if(arr[i] == 2) {
                res[0] = i;
            }
        }

        return res;
    }
}