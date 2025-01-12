class Solution(object):
    def canBeValid(self, s, locked):
        """
        :type s: str
        :type locked: str
        :rtype: bool
        """
        n = len(s)
        
        if n % 2 != 0:
            return False
        
        open_pos = 0
        for i in range(n):
            if locked[i] == '0' or s[i] == '(':
                open_pos += 1
            else:
                open_pos -= 1
     
            if open_pos < 0:
                return False

        close_pos = 0
        for i in range(n - 1, -1, -1):
            if locked[i] == '0' or s[i] == ')':
                close_pos += 1
            else:
                close_pos -= 1

            if close_pos < 0:
                return False

        return True