class Solution(object):
    def findThePrefixCommonArray(self, A, B):
        """
        :type A: List[int]
        :type B: List[int]
        :rtype: List[int]
        """
        n=len(A)
        c=[0]*n
        for i in range(n):
            if any(item in B[:i+1] for item in A[:i+1]):
                c[i]+=len(set(B[:i+1]) & set(A[:i+1]))
                
        return c