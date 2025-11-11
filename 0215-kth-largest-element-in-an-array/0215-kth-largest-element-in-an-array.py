class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        pq = []
        for num in nums:
            heapq.heappush(pq, (-num))
        res = 0
        while k>0:
            res = -heapq.heappop(pq)
            k -= 1
        return res
