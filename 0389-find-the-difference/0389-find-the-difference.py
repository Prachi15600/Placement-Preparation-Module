class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        s=Counter(s)
        t=Counter(t)
        for i,v in t.items():
            if(s[i]==v):
                continue
            return i