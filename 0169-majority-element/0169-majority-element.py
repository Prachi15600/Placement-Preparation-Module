class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        count = 0
        Ele = 0
        for i in range(len(nums)):
            if count == 0:
                Ele = nums[i]
                count = 1
            elif nums[i] == Ele:
                count += 1
            else:
                count -= 1
        return Ele
