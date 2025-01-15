class Solution(object):
    def minimizeXor(self, num1, num2):
        """
        :type num1: int
        :type num2: int
        :rtype: int
        """
        n=bin(num2).count("1")
        x=0
        num=0
        bit=31
        while num<n:
            if num1&(1<<bit) or n-num>bit:
                x|=(1<<bit)
                num+=1
            bit-=1
        return x