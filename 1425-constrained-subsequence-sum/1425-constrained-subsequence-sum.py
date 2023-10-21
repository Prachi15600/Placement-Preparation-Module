class Solution:
    def constrainedSubsetSum(self, nums: List[int], k: int) -> int:
        
        best_here = nums[0]
        heap = [(-best_here, 0)]
        best = best_here
        for i in range(1, len(nums)):
		    # Ensure top of the heap is no more than k indices away
            while heap[0][1] < i - k:
                heapq.heappop(heap)
            
            best_here = max(nums[i], nums[i] - heap[0][0])
            best = max(best, best_here)
            heapq.heappush(heap, (-best_here, i))
         
        return best