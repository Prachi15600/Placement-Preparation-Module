class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        pq = []

        for num in nums:
            pq.append(-num)

        heapq.heapify(pq)
        res = 0
        while k > 0:
            res = -heapq.heappop(pq)
            k -= 1
        return res
