class Solution:
    def kthGrammar(self, n: int, k: int) -> int:
        
        def helper(n, k):
            if n == 1:
                return 0
            else:
                p = helper(n-1, -(k//-2))
                return p if k%2 != 0 else 1-p
            
        return helper(n,k)