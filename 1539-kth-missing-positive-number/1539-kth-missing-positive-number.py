class Solution:
    def findKthPositive(self, arr: List[int], k: int) -> int:
        if arr[0]>k:
            return k
        num = k
        for i in arr:
            if i<=num:
                num += 1
            else:
                break
        return num