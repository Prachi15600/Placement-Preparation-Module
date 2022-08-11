class Solution:
    def countPairs(self, nums: List[int], k: int) -> int: 
        Count = 0
        for i in range(len(nums)):
            for j in range(1,len(nums),1):
                if nums[i] == nums[j] and i*j % k == 0:
                    if i >= 0 and j > i :
                        Count += 1
        return Count