class Solution:
    def backspaceCompare(self, S: str, T: str) -> bool:
        def strip_str(v: str) -> str:
            while '#' in v:
                i = v.index('#')
                if i == 0:
                    v = v[i+1:len(v)]
                    continue
                v = v[:i-1] + v[i+1:len(v)]
            return v
        return strip_str(S) == strip_str(T)
        