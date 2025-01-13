class Solution {
    public int minAddToMakeValid(String s) {
        if(s.length() == 0) return 0;
        
        int countOpen = 0, countClose = 0;

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(' ) {
                countOpen++;
            }
            else if(s.charAt(i) == ')') {
                if(countOpen > 0) {
                    countOpen--;
                }
                else{
                    countClose++;
                }
            }
        }

        return countOpen + countClose;
    }
}