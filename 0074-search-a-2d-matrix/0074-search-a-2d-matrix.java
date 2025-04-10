class Solution {
    public boolean binarySearch(int[][] matrix, int low, int high, int row, int target) {
        while(low <= high) {
            int mid = (low + high)/2;
            if(matrix[row][mid] == target) {
                return true;
            }
            else if(target < matrix[row][mid]) {
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<n; i++) {
            if(target >= matrix[i][0] && target <= matrix[i][m-1]) {
                return binarySearch(matrix, 0, m-1, i, target);
            }
        }
        return false;
 
    }
}