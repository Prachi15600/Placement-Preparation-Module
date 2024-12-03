class Solution {
    public String addSpaces(String s, int[] spaces) {
        int n = s.length();
        int m = spaces.length;
        StringBuilder st = new StringBuilder();
        int i=0, j=0;
        while(i<n && j<m) {
            if(i != spaces[j]) {
                st.append(s.charAt(i));
                i++;
            }
            
            else {
                st.append(' ');
                j++;
            }
        }
        
        while(i<n) {
            st.append(s.charAt(i));
            i++;
        }
        
        return st.toString();
    }
}