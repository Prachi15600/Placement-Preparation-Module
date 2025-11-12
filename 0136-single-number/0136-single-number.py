class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        n = len(nums)
        d = {}
        for num in nums:
            if num in d:
                d[num] += 1
            else:
                d[num] = 1
        for num in d:
            if d[num] == 1:
                return num
        return -1