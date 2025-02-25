class Solution {
    String commonString(String s1, String s2) {
        int n = Math.min(s1.length(), s2.length());
        String str = "";
        for(int i=0; i<n; i++) {
            if(s1.charAt(i) == s2.charAt(i)) {
                str += s1.charAt(i);
            }
            else break;
        }
        return str;
    }
    public String longestCommonPrefix(String[] strs) {
        String ans = strs[0];

        for(int i=1; i<strs.length; i++) {
            ans = commonString(ans, strs[i]);
        }
        return ans;
    }
}