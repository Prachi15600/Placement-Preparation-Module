class Solution(object):
    def stringMatching(self, words):
        return list(set([w1 for w1 in words for w2 in words if w1 != w2 and w1 in w2]))
        