class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        l = []
        for i in nums:
            i = i*i
            l.append(i)
        l.sort()
        return l