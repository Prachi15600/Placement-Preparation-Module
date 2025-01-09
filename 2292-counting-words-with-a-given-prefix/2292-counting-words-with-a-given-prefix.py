class Solution(object):
    def prefixCount(self, words, pref):
        return sum(1 for w in words if w[:len(pref)] == pref)
        