class Solution:
    def countMatches(self, items: List[List[str]], ruleKey: str, ruleValue: str) -> int:
        dic = {'type':0,'color':1,'name':2}
        cnt = 0
        for item in items:
            if item[dic[ruleKey]]==ruleValue:
                cnt += 1
        return cnt