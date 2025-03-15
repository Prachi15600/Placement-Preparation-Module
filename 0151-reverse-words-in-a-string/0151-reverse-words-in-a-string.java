class Solution {
    public String reverseWords(String s) {
        String res = "";
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            st1.push(s.charAt(i));
        }

        while(!st1.isEmpty()) {
            char temp = st1.pop();
            if(temp == ' ') {
                while(!st2.isEmpty()) {
                    res += st2.pop();
                }
                res += ' ';
            }
            else {
                st2.push(temp);
            }

        }

        while(!st2.isEmpty()) {
            res += st2.pop();
        }

        return res.trim().replaceAll("\\s+", " ");
    }
}