class Solution:
    def paintWalls(self, cost: List[int], time: List[int]) -> int:
        @cache
        def dp(i, t):
            if t >= len(time): return 0
            if i == len(cost): return inf
            return min(dp(i + 1, t), dp(i + 1, t + time[i] + 1) + cost[i])
        return dp(0, 0)