class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        index = -1
        n = len(nums)

        for i in range(n-1, 0, -1) :
            if nums[i-1] <nums[i]:
                index = i-1
                break
        

        if index != -1:
            nextGreater = -1

            for i in range(n-1, index, -1):
                if nums[index] < nums[i]:
                    nextGreater = i
                    break

            nums[index], nums[nextGreater] = nums[nextGreater], nums[index]

        self.reverse(nums, index+1, n-1)

    def reverse(self, nums, l, r):
        while l < r:
            nums[l], nums[r] = nums[r], nums[l]
            l = l + 1
            r = r - 1
        