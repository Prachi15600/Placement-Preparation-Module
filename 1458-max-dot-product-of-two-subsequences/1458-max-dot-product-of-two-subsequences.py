class Solution:
    def maxDotProduct(self, nums1: List[int], nums2: List[int]) -> int:
        MIN = -999999999
        @functools.lru_cache(None)
        def dfs(i,j):
            if i >= len(nums1) or j >= len(nums2): return MIN
            return max(nums1[i]*nums2[j] + dfs(i+1, j+1), dfs(i+1, j), dfs(i, j+1), nums1[i]*nums2[j])
        return dfs(0,0)