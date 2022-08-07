class Solution:
    def findTheDistanceValue(self, arr1: List[int], arr2: List[int], d: int) -> int:
        ans = 0
        for i in arr1:
            count = 1
            for j in arr2:
                x = abs(i - j)
                if x <= d :
                    count = 0
                    break
            ans+=count
        return ans