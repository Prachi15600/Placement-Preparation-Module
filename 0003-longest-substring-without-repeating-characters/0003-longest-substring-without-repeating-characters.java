class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        int start = 0;
        int maxi = 0;

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(hmap.containsKey(ch) && hmap.get(ch) >= start) {
                start = hmap.get(ch) + 1;
            }
            
            hmap.put(ch, i);
            maxi = Math.max(maxi, i - start + 1);
        }

        return maxi;
    }
}
// {(p,0),(w,1),(k,3),(e,4)(w,5)} start = 2 maxi = 3
// s = pwwkew
//     012345
// o/p = 3