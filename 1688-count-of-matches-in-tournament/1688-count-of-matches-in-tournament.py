class Solution:
    def numberOfMatches(self, n: int) -> int:
        res = 0
        while n > 1:
            if(n%2 == 0):
                m = n//2
                res += m
                n = n//2
                
            
            else:
                m = (n-1)//2
                res += m
                n = ((n-1)//2) + 1
        return res  