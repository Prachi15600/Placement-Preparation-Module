class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        hmap = {}
        for num in nums:
            hmap[num] = hmap.get(num,0)+1

        pq = []
        for num in hmap:
            heapq.heappush(pq, (-hmap[num],num))

        res = []
        while k>0:
            freq, num = heapq.heappop(pq)
            res.append(num)
            k -= 1
        return res