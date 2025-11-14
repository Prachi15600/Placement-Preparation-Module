class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        d = {0:1}
        count = 0
        Sum = 0

        for num in nums:
            Sum += num
            remove = Sum - k
            if remove in d:
                count += d[remove]

            d[Sum] = d.get(Sum, 0)+1

        return count