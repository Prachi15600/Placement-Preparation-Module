class Solution:
    def isValid(self, s: str) -> bool:
        st = []
        st.append(s[0])

        for i in range(1, len(s)):
            c = s[i]
            if c in [')', '}', ']']:
                if not st: return False
                if(st[-1] == '(' and c == ')' or st[-1] == '{' and c == '}' or st[-1] == '[' and c == ']'):
                    st.pop()
                else:
                    return False
            else:
                st.append(c)

        return len(st)==0