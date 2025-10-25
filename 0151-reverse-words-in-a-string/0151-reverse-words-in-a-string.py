class Solution:
    def reverseWords(self, s: str) -> str:
        str = ""
        res = []

        for i in range(len(s)):
            if s[i] == ' ':
                if str:
                    res.append(str)
                    str = ""

            else:
                str += s[i]
        if str:
            res.append(str)
        res.reverse()
        return " ".join(res)