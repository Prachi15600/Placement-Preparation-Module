class Solution:
    def pivotInteger(self, n: int) -> int:
        sum1 = 0
        res = 0
        for i in range(1,n+1):
            sum1 = sum1 + i
            sum2 = 0
            for j in range(i,n+1):
                sum2 = sum2 + j
        
            if sum1 == sum2:
                res = i
                return res
        return -1;
            