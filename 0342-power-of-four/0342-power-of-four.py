class Solution:
    def isPowerOfFour(self, n: int) -> bool:
        if n > 0:
            if log(n, 4) % 1 == 0:
                return True
            else:
                return False