class Solution:
    def executeInstructions(self, n: int, startPos: List[int], s: str) -> List[int]:
        res = []
        row = startPos[0]
        col = startPos[1]
        row1 = row
        col1 = col
        for i in range(len(s)):
            count = 0
            col = col1
            row = row1
            for j in range(i,len(s)):
                if row >= 0 and col >= 0 and row < n and col < n:
                    if s[j] == 'R':
                        col += 1
                    if s[j] == 'L':
                        col -= 1
                    if s[j] == 'D':
                        row += 1
                    if s[j] == 'U':
                        row -= 1
                if row >= 0 and col >= 0 and row < n and col < n:
                    count += 1
            res.append(count)
        return res
                    