class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        cnt = 0 
        for i in jewels:
            for j in stones:
                if i == j:
                    cnt += 1
        return cnt