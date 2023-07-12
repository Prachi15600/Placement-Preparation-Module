class Solution:
    def sumOddLengthSubarrays(self, arr: List[int]) -> int:
        sum = 0
        l = len(arr)
        for i in range(l):
            for j in range(i,l,2):
                for k in range(i,j+1,1):
                    sum = sum+arr[k]
                    
        return sum