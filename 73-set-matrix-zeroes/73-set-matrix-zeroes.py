class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        m = len(matrix)
        n = len(matrix[0])
        r = [1]*m
        c = [1]*n
        
        for i in range(m):
            for j in range(n):
                if matrix[i][j] == 0:
                    r[i] = 0
                    c[j] = 0
        for i in range(m):
            if r[i] == 0:
                matrix[i] = [0]*n
        for j in range(n):
            if c[j] == 0:
                for k in range(m):
                    matrix[k][j] = 0
        return matrix
        
        