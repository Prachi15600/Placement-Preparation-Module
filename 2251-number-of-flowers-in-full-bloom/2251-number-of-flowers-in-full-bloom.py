class Solution:
    def fullBloomFlowers(self, flowers: List[List[int]], people: List[int]) -> List[int]:

        start = sorted(x for x, y in flowers)
        end = sorted(y for x, y in flowers)
        n = len(start)

        res = []
        for t in people:
            num_start_earlier = self.smaller_equal(start, t)
            num_end_earlier = self.smaller(end, t)
            res.append(num_start_earlier - num_end_earlier)

        return res
    
    @staticmethod
    def smaller_equal(start: List[int], time: int) -> int:
        """return number of elements in start that are smaller or equal to time"""
        if start[0] > time: return 0
        if start[-1] <= time: return len(start)

        left, right = 0, len(start) - 1
        while left < right:
            mid = left + (right - left + 1) // 2
            if start[mid]<=time:
                left = mid
            else:
                right = mid - 1

        return left + 1

    @staticmethod
    def smaller(end: List[int], time: int) -> int:
        """return number of elements in end that are smaller to time"""
        if end[0] >= time: return 0
        if end[-1] < time: return len(end)

        left, right = 0, len(end) - 1
        while left < right:
            mid = left + (right - left) // 2
            if end[mid]<time:
                left = mid + 1
            else:
                right = mid

        return right