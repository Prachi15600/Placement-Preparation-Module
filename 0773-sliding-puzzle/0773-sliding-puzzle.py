class Solution:
    def slidingPuzzle(self, board: List[List[int]]) -> int:
        dirictions = [[1, 3], [0, 2, 4], [1, 5], [0, 4], [1, 3, 5], [2, 4]]
        target = '123450'
        visited = set()
        que = deque()
        first = ''.join(str(num) for row in board for num in row)

        que.append(first)
        visited.add(first)
        step = 0

        while que:
            for _ in range(len(que)):
                curr = que.popleft()
                if curr == target:
                    return step

                zero_idx = curr.index('0')
                for move in dirictions[zero_idx]:
                    next_per = list(curr)
                    next_per[zero_idx], next_per[move] = next_per[move], next_per[zero_idx]
                    next_per = ''.join(next_per)
                    if next_per not in visited: 
                        visited.add(next_per)
                        que.append(next_per)
            step += 1

        return -1
