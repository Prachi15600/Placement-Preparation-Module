class Solution:
    def getNoZeroIntegers(self, n: int) -> List[int]:
        def isValid(num:int) -> bool:
            while num > 0:
                if(num % 10 ==0) :
                    return False
                num = num//10
            return True

        for a in range(1,n):
            b = n-a
            if isValid(a) and isValid(b):
                return [a,b]

        