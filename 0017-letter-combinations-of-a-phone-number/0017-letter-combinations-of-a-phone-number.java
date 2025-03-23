class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.isEmpty()) return res;
        String str = "";
        generateLetter(digits, res, str, 0);
        return res;
    }

    void generateLetter(String digits, List<String> res, String str, int index) {
        String[] mapping = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        if(index == digits.length()) {
            res.add(str);
            return;
        }

        String letter = mapping[digits.charAt(index) - '0'];
        for(char ch : letter.toCharArray()) {
            generateLetter(digits, res, str+ch, index+1);
        }
    }
}