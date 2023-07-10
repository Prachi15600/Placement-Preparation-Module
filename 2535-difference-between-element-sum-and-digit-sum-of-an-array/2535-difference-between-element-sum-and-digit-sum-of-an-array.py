class Solution:
    def differenceOfSum(self, nums: List[int]) -> int:
        ele_sum = 0
        dig_sum = 0
        for i in range(len(nums)):
            ele_sum = ele_sum + nums[i]
            j = nums[i]
        #for j in range(len(nums)):
            while j>0:
                dig = j%10
                dig_sum = dig_sum+dig
                j = j//10
        
            
        return ele_sum - dig_sum
        