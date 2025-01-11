class Solution:
    def canConstruct(self, s: str, k: int) -> bool:
        if len(s) < k: return False
        
        counts, odd = {}, 0
        
        for l in s:
            if l in counts: counts[l] += 1
            else: counts[l] = 1
        
        for v in counts:
            if counts[v] % 2 == 1: odd += 1
        
        if odd > k: return False
        
        return True