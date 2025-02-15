class Solution {
    public int maxProfit(int[] prices) {
        int Max = 0;
        int Min = Integer.MAX_VALUE;
        
        int n=prices.length;
        for(int i=0; i<n; i++) {
            Min = Math.min(Min, prices[i]);
            Max = Math.max(Max, prices[i] - Min);
        }

        return Max;
    }
}