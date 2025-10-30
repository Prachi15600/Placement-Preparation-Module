class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        # 2 1 5 4 3 0 0 , 2 3 0 0 1 4 5

        n = len(nums)
        bp = -1
        
        for i in range(n-1,-1,-1) :
            if nums[i]>nums[i-1]:
                bp = i-1
                break

        if bp != -1:
            nextGreater = -1
            for i in range(n-1, bp, -1):
                if nums[i] > nums[bp]:
                    nextGreater = i
                    break

            nums[bp], nums[nextGreater] = nums[nextGreater], nums[bp]

        self.reverse(nums, bp+1, n-1)

    def reverse(self, nums, l, r):
        while l<r:
            nums[l], nums[r] = nums[r], nums[l]
            l += 1
            r -= 1
    
        