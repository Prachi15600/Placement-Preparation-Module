class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        d = {}
        res = [0]*2
        for i in range(len(nums)):
            search = target - nums[i]
            if search in d:
                res[0] = d[search]
                res[1] = i
            
            d[nums[i]] = i
        print(d)
        return res