class Solution:
    def leftmostBuildingQueries(self, H: List[int], queries: List[List[int]]) -> List[int]:
        n = len(queries)
        stack = []
        res = [-1]*n
        h = []
        que = []
        for qi, (i,j) in enumerate(queries):
            if i == j:
                res[qi] = i
            elif i < j and H[i] < H[j]:
                res[qi] = j
            elif i > j and H[i] > H[j]:
                res[qi] = i
            else:
                que.append((max(i,j), max(H[i],H[j]),qi))
        que.sort(reverse = True)
        for i in range(len(H)):
            while que and que[-1][0] < i:
                _, maxh, qi = que.pop()
                heappush(h, (maxh, qi))
            while h and h[0][0] < H[i]:
                maxh, qi = heappop(h)
                res[qi] = i 
        return res 