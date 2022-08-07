class Solution:
    def reverseWords(self, s: str) -> str:
        word = s.split(" ")
        l = []
        for i in word:
            l.append(i[::-1])
            l.append(" ")
        return "".join(l).strip()