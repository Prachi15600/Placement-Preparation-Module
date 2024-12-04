class Solution:
    def canMakeSubsequence(self, str1: str, str2: str) -> bool:
        S2 = len(str2)
        i = 0
        for c in str1:
            i += i < S2 and (c == str2[i] or ascii_letters[(ord(c) - 96) % 26] == str2[i])
        return i == S2
        