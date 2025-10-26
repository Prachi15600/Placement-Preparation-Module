class Solution:
    def maxCommon(self, ans, st):
        maxL = 0
        count = 0
        n = min(len(ans), len(st))

        for i in range(n) :
            if ans[i] == st[i]:
                count += 1
            else: break
        maxL = max(maxL, count)
        if len(ans)>len(st): return ans[0: maxL]
        else: return st[0:maxL]
    def longestCommonPrefix(self, strs: List[str]) -> str:
        ans = strs[0]
        if(len(strs) == 0):
            return ans

        for i in range(1,len(strs)):
            ans = self.maxCommon(ans, strs[i])
        return ans