class Solution:
    def minimumTime(self, grid):
        m, n, dict1 = len(grid), len(grid[0]), collections.defaultdict(int)

        if grid[0][1] > 1 and grid[1][0] > 1:
            return -1

        for i in range(m):
            for j in range(n):
                dict1[(i,j)] = float("inf")

        dict1[(0,0)] = 0

        stack = [(0,0,0)]

        while stack:
            time, i, j = heappop(stack)

            if i == m-1 and j == n-1:
                return time

            for ni,nj in [(i+1,j),(i-1,j),(i,j-1),(i,j+1)]:
                if 0 <= ni < m and 0 <= nj < n:
                    new_time = time + 1 + max(0,(grid[ni][nj]-time)//2*2)
                    if dict1[(ni,nj)] > new_time:
                        heappush(stack,(new_time,ni,nj))
                        dict1[(ni,nj)] = new_time

        return -1