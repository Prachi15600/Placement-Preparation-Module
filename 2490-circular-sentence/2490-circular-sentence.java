class Solution {
    public boolean isCircularSentence(String s) {
        int n = s.length();
        if(s.charAt(n-1) != s.charAt(0)) return false;
        
        int i=0;
        
        while(i<n) {
            while(i<n && s.charAt(i) != ' ' ) {
                i++;
            }
            if(i<n && s.charAt(i-1) != s.charAt(i+1)) return false;
            i++;
        }
        return true;
    }
}