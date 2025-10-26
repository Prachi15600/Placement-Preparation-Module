class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t): return False
        res = [0] * 26

        for i in range(len(s)):
            res[ord(s[i]) - ord('a')] += 1
            res[ord(t[i]) - ord('a')] -= 1
        

        for i in range(len(res)):
            if res[i] != 0: return False
        return True