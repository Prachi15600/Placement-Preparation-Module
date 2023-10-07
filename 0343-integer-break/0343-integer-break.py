class Solution:
    def integerBreak(self, n: int) -> int:
        if n==2:
            return 1
        if n==3:
            return 2
        @lru_cache(None)
        def dp(n):
            #dont break
            ans=n
            #break
            for i in range(1,n//2+1):
                val=dp(i)*dp(n-i)
                ans=max(ans,val)
            return ans
        return dp(n)