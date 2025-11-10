class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        hset = set()
        count = 0
        maxi = 0

        for num in nums:
            hset.add(num)

        for num in hset:
            if (num-1) not in hset:
                count = 1
                currNum = num

                while (currNum+1) in hset:
                    count += 1
                    currNum += 1
                maxi = max(maxi, count)

        return maxi