class Solution:
    def resultsArray(self, nums: List[int], k: int) -> List[int]:
        s = 0
        result = []
        for i in range(len(nums)):
            if i and nums[i] != nums[i-1] + 1:
                s = i
            
            if i >= k - 1:
                if i - s + 1 >= k:
                    result.append(nums[i])
                else:
                    result.append(-1)
                
        return result