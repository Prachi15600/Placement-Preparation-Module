class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(matrix[i][j] == 0) {
                    matrixZeros(i, j, matrix, n, m);
                }
            }
        }


        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(matrix[i][j] == 'a') {
                    matrix[i][j] = 0;
                }
            }
        }

        //return matrix;
    }

    void matrixZeros(int i, int j, int[][] matrix, int n, int m) {
        
        for(int x=0; x<m; x++) {
            if(matrix[i][x] == 0) continue;
            matrix[i][x] = 'a';
        }

        for(int x=0; x<n; x++) {
            if(matrix[x][j] == 0) continue;
            matrix[x][j] = 'a';
        }
    }
}