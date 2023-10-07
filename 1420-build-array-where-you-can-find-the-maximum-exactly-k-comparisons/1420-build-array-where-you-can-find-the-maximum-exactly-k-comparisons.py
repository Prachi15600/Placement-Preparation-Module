class Solution:
    def numOfArrays(self, N: int, M: int, K: int) -> int:
        mod=10**9+7
        @lru_cache(None)
        def dp(n,mmax,k):
            if n==0: 
                if k==0: return 1
                return 0
            ans=0
            #check and reduce k here
            #you can take any element from 1 to mmax as it wont affect the max value
            if k>0:
                for i in range(mmax+1,M+1):
                    ans+=dp(n-1,i,k-1)
            #keep k constant
            ans+=(dp(n-1,mmax,k)*mmax)
            return ans%mod
        return dp(N,0,K)%mod
    