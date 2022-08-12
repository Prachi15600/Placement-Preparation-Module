class Solution:
    def minPartitions(self, n: str) -> int:
        Max = 0
        for i in n:
            Max = max(Max,ord(i)-ord('0'))
    
        return Max                  