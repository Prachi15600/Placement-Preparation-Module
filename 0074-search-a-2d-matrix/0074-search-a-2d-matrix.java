class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int low = 0;
        int high = n * m - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Convert mid index to 2D indices
            int row = mid / m;
            int col = mid % m;
            int midElement = matrix[row][col];

            if (midElement == target) {
                return true;
            } else if (target < midElement) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }
}
