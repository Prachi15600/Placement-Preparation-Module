class Solution {
    public String longestPalindrome(String s) {
        int maxLength = 1;
        int sp = 0;

        for(int i=1; i<s.length(); i++) {
            // even
            int l = i-1;
            int r = i;

            while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)) {
                if(r-l+1 > maxLength) {
                    maxLength = r-l+1;
                    sp = l;
                }
                l--;
                r++;
            }

            // odd
            l = i-1;
            r = i+1;
            while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)) {
                if(r-l+1 > maxLength) {
                    maxLength = r-l+1;
                    sp = l;
                }
                l--;
                r++;
            }
        }

        return s.substring(sp, sp+maxLength);
    }
}