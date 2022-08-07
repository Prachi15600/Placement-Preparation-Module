class Solution:
    def buildArray(self, nums: List[int]) -> List[int]:
        l = []
        for i in range(len(nums)):
            ans = nums[nums[i]]
            l.append(ans)
        return l