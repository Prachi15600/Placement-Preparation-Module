class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        l = 0
        r = len(nums)-1
        while l<= r:
            for i in range(len(nums)):
                mid = (l+r)//2
                if nums[mid] < target :
                    l = mid+1
                elif nums[mid] > target:
                    r = mid -1
                else: 
                    return mid
                
            nums.append(target)
            nums.sort()
            s = nums.index(target)
            return s
            
                
                