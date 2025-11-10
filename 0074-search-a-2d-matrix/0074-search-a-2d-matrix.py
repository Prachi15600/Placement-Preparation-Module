class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        n = len(matrix)
        m = len(matrix[0])
        l = 0
        r = n*m-1
        while(l<=r):
            mid = (l+r)//2
            row = mid//m
            col = mid%m
            midEle = matrix[row][col]

            if(target < midEle):
                r = mid-1
            elif(target > midEle):
                l = mid+1
            else:
                return True
        return False