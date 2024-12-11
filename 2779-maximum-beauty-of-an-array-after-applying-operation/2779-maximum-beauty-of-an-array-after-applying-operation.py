class Solution:
    def maximumBeauty(self, A: List[int], k: int) -> int:
        A.sort()
        i = 0
        for j in range(len(A)):
            if A[j] - A[i] > k * 2:
                i += 1
        return j - i + 1
        