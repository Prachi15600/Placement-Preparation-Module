class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        cnt = 0
        l = []
        for i in range(len(nums)):
            cnt = 0
            for j in range(len(nums)):
                if nums[i] > nums[j] :
                    cnt += 1
            l.append(cnt)
        return l