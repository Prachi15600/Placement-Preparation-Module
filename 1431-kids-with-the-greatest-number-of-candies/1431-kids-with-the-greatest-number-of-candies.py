class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        l = []
        Max = max(candies)
        for i in range(len(candies)):
            if candies[i] + extraCandies >= Max :
                l.append(True)
            else :
                l.append(False)
        return l