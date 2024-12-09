class Solution:
    def isArraySpecial(self, nums: List[int], queries: List[List[int]]) -> List[bool]:
        prefix_sum: list[int] = []
        non_specials: int = 0
        for idx in range(len(nums)):
            if idx and nums[idx - 1] & 1 == nums[idx] & 1:
                non_specials += 1
            prefix_sum.append(non_specials)
        output: list[bool] = []
        for query in queries:
            start, end = query
            invalids: int = prefix_sum[end]
            invalids -= prefix_sum[start]
            output.append(invalids == 0)
        return output