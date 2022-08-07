class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        m = len(accounts)
        n = len(accounts[0])
        Max = 0
        for i in range(m):
            Sum = 0
            for j in range(n):
                Sum = Sum + accounts[i][j]
            Max = max(Max,Sum)
        return Max