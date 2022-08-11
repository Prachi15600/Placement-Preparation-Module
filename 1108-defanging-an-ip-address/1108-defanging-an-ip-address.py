class Solution:
    def defangIPaddr(self, address: str) -> str:
        l = ""
        for i in address:
            if i == "." :
                l = l+"[.]"
            else:
                l = l+i
        return l