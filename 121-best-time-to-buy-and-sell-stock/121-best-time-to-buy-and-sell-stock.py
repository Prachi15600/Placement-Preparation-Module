class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        Max = 0
        Min = 10000
        profit = 0
        for i in range(len(prices)):
            Min = min(Min,prices[i])
            profit = prices[i] - Min
            Max = max(Max,profit)
        return Max