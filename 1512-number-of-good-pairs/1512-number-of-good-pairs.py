class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        Count = 0
        for i in range(len(nums)):
            for j in range(1,len(nums)):
                if nums[i] == nums[j] and i < j :
                    Count += 1
        return Count