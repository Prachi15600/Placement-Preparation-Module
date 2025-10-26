class Solution:
    def repeatedStringMatch(self, a: str, b: str) -> int:
        # abcabcabc
        count = 1
        res = a
        while(len(res) < len(b)):
            if b in res:
                return count
            res = res + a
            count += 1
        print(res)
        if b in res:
            return count
        res += a
        if b in res:
            return count+1

        return -1