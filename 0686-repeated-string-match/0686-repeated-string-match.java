class Solution {
    public int repeatedStringMatch(String a, String b) {
        String str = a;
        int m = b.length();
        int count = 1;

        while(str.length() < m) {
            str += a;
            count++;
        }

        if(str.indexOf(b) != -1) {
            return count;
        }

        str += a;
        count++;

        if(str.indexOf(b) != -1) {
            return count;
        }
        return -1;
        
    }
}