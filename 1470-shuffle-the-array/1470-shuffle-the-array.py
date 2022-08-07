class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        l1 = []
        l2 = []
        l3 = []
        k = 0
        for i in range(0,len(nums)//2):
            l1.append(nums[i])
        for j in range(len(nums)//2, len(nums)):
            l2.append(nums[j])
        while k < len(nums)//2:
            l3.append(l1[k])
            l3.append(l2[k])
            k = k+1
        return l3