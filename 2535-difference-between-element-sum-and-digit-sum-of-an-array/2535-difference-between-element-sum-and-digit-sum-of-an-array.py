class Solution:
    def differenceOfSum(self, nums: List[int]) -> int:
        ele_sum = 0
        dig_sum = 0
        for i in range(len(nums)):
            ele_sum = ele_sum + nums[i]
        
        for j in range(len(nums)):
            while nums[j]>0:
                dig = nums[j]%10
                dig_sum = dig_sum+dig
                nums[j] = nums[j]//10
        
            
        return ele_sum - dig_sum
        