class Solution:
    def minCostClimbingStairs(self, cost):
        step = [0 for _ in cost]
        step[0], step[1] = cost[0], cost[1]
        for i in range(2, len(cost)):
            step[i] = cost[i] + min(step[i-2], step[i-1])
        return min(step[-2], step[-1])