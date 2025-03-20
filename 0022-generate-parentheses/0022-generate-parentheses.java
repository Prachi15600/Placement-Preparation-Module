class Solution {
    List<String> res = new ArrayList<>();
    boolean isValid(String str) {
        int count = 0;
         for(char ch : str.toCharArray()) {
            if(ch == '(') count++;
            else count--;

            if (count < 0) return false; 
         }
         return count==0;
    }
    public void solve(StringBuilder str, int n) {
        if(str.length() == 2*n) {
            if(isValid(str.toString())) {
                res.add(str.toString());
            }
            return;
        }

        str.append('(');
        solve(str, n);
        str.deleteCharAt(str.length()-1);

        str.append(')');
        solve(str, n);
        str.deleteCharAt(str.length()-1);
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder str = new StringBuilder();

        solve(str, n);
        return res;

        
    }
}