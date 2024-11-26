class Solution:
    def findChampion(self, n: int, edges: List[List[int]]) -> int:
        return winners.pop() if len(winners := set(range(n)) - {b for _, b in edges}) == 1 else -1