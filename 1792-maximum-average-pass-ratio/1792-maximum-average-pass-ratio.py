class Solution:
    def maxAverageRatio(self, classes, extraStudents):
        hp = []
        for x, y in classes:
            target_difference = (x+1)/(y+1) - x/y
            heapq.heappush(hp, (-target_difference, x, y))
        
        for _ in range(extraStudents):
            _, x, y = heapq.heappop(hp)
            target_difference = (x+2)/(y+2) - (x+1)/(y+1)
            heapq.heappush(hp, (-target_difference, x+1, y+1))
        
        ans = 0
        while hp:
            _, x, y = heapq.heappop(hp)
            ans += x / y / len(classes)
        return ans