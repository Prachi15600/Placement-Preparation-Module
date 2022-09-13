class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        r = [1]
        for i in range(1,rowIndex+1):
            r.append(r[i-1]*(rowIndex - i +1)//i)
        return r