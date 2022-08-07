class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        Max = 0
        for i in sentences:
            Count = 0
            for j in i:
                if j == " ":
                    Count = Count + 1
            Max = max(Max,Count)
        return Max+1
                