class Solution(object):
    def findLengthOfShortestSubarray(self, arr):
        prefEnd, suffStart = 0 , len(arr) - 1
        i = 1
        while (i < len(arr) and arr[i] >= arr[i - 1]): 
            prefEnd += 1
            i += 1
        i = len(arr) - 1
        while (i >= 0 and arr[i] >= arr[i - 1]): 
            suffStart -= 1
            i -= 1
        if (prefEnd == len(arr)): return 0
        ans = suffStart
        suff = arr[suffStart:]
        for i in range(prefEnd + 1):
           ans = min(ans , bisect.bisect_left(suff, arr[i]) + suffStart - i - 1)
        return max (0, ans)