class Solution:
    def restoreString(self, s: str, indices: List[int]) -> str:
        l = ""
        for i in range(len(indices)):
            l += s[indices.index(i)]
        return l