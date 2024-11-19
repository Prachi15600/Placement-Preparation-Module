class Solution:
    def maximumSubarraySum(self, nums: List[int], k: int) -> int:
        seen = set()
        l, maxSum, current = 0, 0, 0
        # sliding window growing to the right:
        for r, item in enumerate(nums):
            # shrink the window from the left
            while item in seen or (r - l + 1) > k:
                left = nums[l]                
                seen.remove(left)
                current -= left
                l += 1
            current += item                
            seen.add(item)                
            # calculate the max when we hit length k:
            if (r - l + 1) == k:
                maxSum = max(maxSum, current)
        
        return maxSum