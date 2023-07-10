class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        sum1 = 0
        pro = 1
        while n:
            sum1 = sum1 + n%10
            pro = pro * (n%10)
            n = n//10
        res = pro - sum1
        return res