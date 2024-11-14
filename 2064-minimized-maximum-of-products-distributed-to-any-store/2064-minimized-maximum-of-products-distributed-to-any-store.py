class Solution:
    def minimizedMaximum(self, N: int, quantities: List[int]) -> int:

        def good(val):
            total = 0
            for q in quantities:
                groups = q // val + int(q % val > 0)
                total += groups
                if total > N:
                    return False
            return True

            


        l, r = 1, max(quantities)

        while l < r:
            mid = (l + r) // 2
            if good(mid):
                r = mid
            else:
                l = mid + 1

        return l