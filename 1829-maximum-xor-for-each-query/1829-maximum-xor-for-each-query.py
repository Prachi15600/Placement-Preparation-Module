class Solution:
    def getMaximumXor(self, nums: List[int], maximumBit: int) -> List[int]:
        n = len(nums)
        arr = []
        XOR =0;
        
        for i in range(n):
            XOR ^= nums[i];
            
        mask = (1<<maximumBit) - 1
        
        for i in range(n):
            k = XOR ^ mask
            arr.append(k)
            XOR ^= nums[n-i-1]
            
        return arr