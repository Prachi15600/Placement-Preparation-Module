class Solution {
    public String maxCommon(String ans, String st) {
        int maxL = 0;
        int count = 0;
        int n = Math.min(ans.length(), st.length());
        //if(ans.isEmpty()) return st;
        //if(st.isEmpty()) return ans;
        for(int i=0; i<n; i++) {
            if(ans.charAt(i) == st.charAt(i)) {
                count++;
            }
            else break;
        }
        maxL = Math.max(maxL, count);
        if(maxL==0 && count==0) return "";
        if(ans.length() > st.length()) return ans.substring(0, maxL).trim();
        else return st.substring(0, maxL).trim();
    }
    public String longestCommonPrefix(String[] strs) {
        String ans = strs[0];
        if(strs.length == 0) return ans;
        for(int i=1; i<strs.length; i++) {
            ans = maxCommon(ans, strs[i]);
        }
        return ans;
    }
}