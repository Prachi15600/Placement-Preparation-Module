class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        String str = "";
        generatePartition(s, res, 0, str, new ArrayList<>());
        return res;
    }

    void generatePartition(String s, List<List<String>> res, int index, String str, List<String> subList) {
        if(index == s.length()) {
            res.add(new ArrayList<>(subList));
            return;
        }

        for(int i=index; i<s.length(); i++) {
            String subString = s.substring(index, i+1);
            if(isPalindrome(subString)) {
                subList.add(subString);
                generatePartition(s, res, i+1, str, subList);
                subList.remove(subList.size()-1);
            }
        }
        
    }

    boolean isPalindrome(String st) {
        int start=0, end = st.length()-1;
        while(start<=end) {
            if(st.charAt(start) != st.charAt(end)) return false;
            end--;
            start++;
        }
        return true;
    }
}