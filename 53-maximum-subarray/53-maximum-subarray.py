class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        Sum = 0
        maxi = nums[0]
        for i in range(len(nums)):
            Sum = Sum+nums[i]
            
            if Sum > maxi:
                maxi = Sum
            if Sum < 0:
                Sum = 0
        
        return maxi
            