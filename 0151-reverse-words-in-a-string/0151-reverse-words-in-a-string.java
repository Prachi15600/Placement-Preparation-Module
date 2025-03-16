class Solution {
    public String reverseWords(String s) {
        ArrayList<String> res = new ArrayList<>();
        String st = "";

        for(int i=0; i<s.length(); i++) {
            
            if(s.charAt(i) == ' ') {
                if(!st.isEmpty()) {
                    res.add(st);
                    st = "";
                }
                
            }
            else {
                st += s.charAt(i);
            }
        }

        if(!st.isEmpty()) {
            res.add(st);
        }

        Collections.reverse(res);

        return String.join(" ", res);
    }
}