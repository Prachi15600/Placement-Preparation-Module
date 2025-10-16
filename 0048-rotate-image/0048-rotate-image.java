class Solution {
    public void rotate(int[][] matrix) {
        //1 4 7
        //2 5 8
        //3 6 9
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<m; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //1 4 7
        //2 5 8
        //3 6 9

        for(int i=0; i<n; i++) {
            for(int j=0; j<m/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }

    }
}