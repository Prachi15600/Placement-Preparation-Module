class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        max_heap = [-num for num in nums]
        heapq.heapify(max_heap)

        res = 0
        for i in range(k):
            res = -heapq.heappop(max_heap)

        return res
