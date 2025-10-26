class Solution:
    def romanToInt(self, s: str) -> int:
        Sum = 0

        for i in range(len(s)):
            if s[i] == 'I':
                Sum = Sum + 1

            elif s[i] == 'V':
                Sum = Sum + 5
                if i > 0 and s[i-1] == 'I':
                    Sum = Sum - 2

            elif s[i] == 'X':
                Sum = Sum + 10
                if i > 0 and s[i-1] == 'I':
                    Sum = Sum - 2

            elif s[i] == 'L':
                Sum = Sum + 50
                if i > 0 and s[i-1] == 'X':
                    Sum = Sum - 20

            elif s[i] == 'C':
                Sum = Sum + 100
                if i > 0 and s[i-1] == 'X':
                    Sum = Sum - 20

            elif s[i] == 'D':
                Sum = Sum + 500
                if i > 0 and s[i-1] == 'C':
                    Sum = Sum - 200

            elif s[i] == 'M':
                Sum = Sum + 1000
                if i > 0 and s[i-1] == 'C':
                    Sum = Sum - 200

        return Sum