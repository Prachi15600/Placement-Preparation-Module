class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        if not nums:
            return [-1, -1]
        
        left,right = bisect.bisect_left(nums, target), bisect.bisect_right(nums, target)
                
        return [left, right - 1] if left < right else [-1, -1]