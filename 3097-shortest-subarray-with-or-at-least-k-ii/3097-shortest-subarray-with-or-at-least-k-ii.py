class Solution:
    def minimumSubarrayLength(self, nums, k):
        n, left, min_len, running_sum, freq = len(nums), 0, float("inf"), 0, [0]*32

        for right in range(n):
            running_sum |= nums[right]

            for i in range(32):
                if nums[right]&(1<<i):
                    freq[i] += 1

            while left <= right and running_sum >= k:
                min_len = min(min_len,right-left+1)

                for i in range(32):
                    if nums[left]&(1<<i):
                        freq[i] -= 1
                        if freq[i] == 0:
                            running_sum = running_sum^(1<<i)
                left += 1 

        return min_len if min_len != float("inf") else -1
        