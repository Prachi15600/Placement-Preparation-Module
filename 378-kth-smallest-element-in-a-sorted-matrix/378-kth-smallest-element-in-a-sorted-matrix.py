class Solution:
    def kthSmallest(self, matrix: List[List[int]], k: int) -> int:
        temp = []
        
        for row in matrix:
            temp.extend(row)
        temp.sort()
        return temp[k-1]