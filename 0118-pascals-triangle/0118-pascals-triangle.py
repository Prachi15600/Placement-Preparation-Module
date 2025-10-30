class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        res = []

        for i in range(numRows) :
            ans = []
            for j in range(i+1):
                if j==0 or j==i:
                    ans.append(1)

                else:
                    sum = res[i-1][j-1] + res[i-1][j]
                    ans.append(sum)

            res.append(ans)
        return res