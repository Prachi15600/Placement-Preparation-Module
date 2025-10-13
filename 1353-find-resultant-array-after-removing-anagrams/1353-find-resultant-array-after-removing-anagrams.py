class Solution:
    def removeAnagrams(self, words: List[str]) -> List[str]:
        def freq(s):
            ans=0
            for c in s:
                i=ord(c)-97
                ans+=(1<<4*i)
            return ans
        n, l=len(words), 0
        ans=[words[0]]
        f0=freq(words[0])
        for r in range(1, n):
            s=words[r]
            x=freq(s)
            if f0!=x:
                ans.append(s)
                l=r
                f0=x
        return ans