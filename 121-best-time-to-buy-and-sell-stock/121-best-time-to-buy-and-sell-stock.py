class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        Max = 0
        Min = float('inf')
        for i in prices:
            Min = min(Min,i)
            profit = i-Min
            Max = max(Max,profit)
        return Max