class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        r, large = nums[0], nums[0]
        for n in range(1, len(nums)) :
            r = max(r+nums[n], nums[n])
            large = max(large, r)
        return large
            