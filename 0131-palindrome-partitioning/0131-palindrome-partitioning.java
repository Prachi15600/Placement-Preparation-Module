class Solution {
    void helper(String s, List<List<String>> res, int n, int idx, List<String>temp) {
        if(idx == n) {
            res.add(new ArrayList(temp));
            return;
        }

        for(int i=idx; i<n; i++) {
            if(isPalindrome(s, idx, i)) {
                temp.add(s.substring(idx, i+1));
                helper(s, res, n, i+1, temp);
                temp.remove(temp.size()-1);
            }
        }
    }

    boolean isPalindrome(String s, int start, int end) {
        while(start < end) {
            if(s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public List<List<String>> partition(String s) {
        int n = s.length();
        List<List<String>> res = new ArrayList<>();
        helper(s, res, n, 0, new ArrayList<>());

        return res;
    }
}