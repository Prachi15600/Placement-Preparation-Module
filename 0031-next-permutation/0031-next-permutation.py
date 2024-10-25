class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        index = -1
        n = len(nums)
        
        for i in range(n-2, -1, -1) :
            if nums[i] <nums[i+1] :
                index = i
                break;
                
        if index == -1:
            nums.reverse()
            return
            
        for i in range(n-1, index, -1) :
            if nums[i] > nums[index] :
                nums[i], nums[index] = nums[index], nums[i];
                break
                
        nums[index+1:] = reversed(nums[index+1:]);
        