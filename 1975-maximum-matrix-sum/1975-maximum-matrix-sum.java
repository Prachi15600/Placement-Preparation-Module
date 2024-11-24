class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int n = matrix.length;
        long sum = 0;
        int minAbs = Integer.MAX_VALUE, count =0;
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                sum += Math.abs(matrix[i][j]);
                if(matrix[i][j] < 0) {
                    count++;
                }
                minAbs = Math.min(minAbs, Math.abs(matrix[i][j]));
            }
        }
        
        if(count%2 != 0) {
            return sum - 2*minAbs;
        }
        return sum;
    }
}