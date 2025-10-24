class Solution {
    public String reverseWords(String s) {
        String str = "";
        ArrayList<String> res = new ArrayList<>();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ' ') {
                if(!str.isEmpty()) {
                    res.add(str);
                    str = "";
                }
            }
            else {
                str += s.charAt(i);
            }
        }
        if(!str.isEmpty()) {
            res.add(str);
        }

        Collections.reverse(res);
        return String.join(" ", res);
    }
}