class Solution:
    def longestPalindrome(self, s: str) -> str:
        sp = 0
        maxLength = 1

        for i in range(1, len(s)):
            # even 
            l = i-1
            r = i

            while l >= 0 and r < len(s) and s[l] == s[r] :
                if r-l+1 > maxLength:
                    maxLength = r-l+1
                    sp = l
                l = l - 1
                r = r + 1
            # odd
            l = i-1
            r = i+1

            while l >= 0 and r < len(s) and s[l] == s[r] :
                if r-l+1 > maxLength:
                    maxLength = r-l+1
                    sp = l
                l = l - 1
                r = r + 1

        return s[sp : sp+maxLength]

        
