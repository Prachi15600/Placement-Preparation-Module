class Solution {
    public boolean rotateString(String s, String goal) {
        if(goal.length() != s.length()) return false;
        
        String str = s+s;
        if(str.contains(goal)) return true;
        
         return false;
    }
}