class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        max_profit = 0
        buy = prices[0]
        sell = 0

        for i in range(len(prices)):
            sell = prices[i] - buy
            max_profit = max(max_profit, sell)
            buy = min(buy, prices[i])

        return max_profit