class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int buy = prices[0];
        int cost = 0;
        for(int i=1; i<prices.length; i++) {
            cost = prices[i] - buy;
            max_profit = Math.max(max_profit, cost);
            buy = Math.min(prices[i], buy);
        }
        return max_profit;
    }
}