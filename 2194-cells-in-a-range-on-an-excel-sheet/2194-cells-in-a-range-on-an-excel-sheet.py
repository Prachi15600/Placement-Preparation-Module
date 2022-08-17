class Solution:
    def cellsInRange(self, s: str) -> List[str]:
        sx = ord(s[0]) -  ord('A')
        ex = ord(s[3]) - ord('A')
        sy = int(s[1])
        ey = int(s[4])
        ans = []
        for x in range(sx, ex + 1):
            for y in range(sy, ey + 1):
                ans.append(chr(x + ord('A'))+str(y))
        return ans