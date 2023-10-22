class Solution:
    def maximumScore(self, nums, k):
        n = len(nums)
        mins = [nums[k]] * n

        for i in range(k - 1, -1, -1):
            mins[i] = min(mins[i + 1], nums[i])
        for j in range(k + 1, n):
            mins[j] = min(mins[j - 1], nums[j])

        mx = 0
        j = k
        for i in range(k, -1, -1):
            while j + 1 < n and mins[j + 1] >= mins[i]:
                j += 1
            mx = max(mx, mins[i] * (j - i + 1))

        i = k
        for j in range(k, n):
            while i - 1 >= 0 and mins[i - 1] >= mins[j]:
                i -= 1
            mx = max(mx, mins[j] * (j - i + 1))

        return mx