class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i=1; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == ')' || c == '}' || c == ']' ) {
                if(st.isEmpty()) return false;
                if(st.peek() == '(' && c == ')' || st.peek() == '{' && c == '}' || st.peek() == '[' && c == ']') {
                    st.pop();
                }
                else return false;
            }
            else {
                st.push(c);
            }

        }
        return st.isEmpty();
    }
}