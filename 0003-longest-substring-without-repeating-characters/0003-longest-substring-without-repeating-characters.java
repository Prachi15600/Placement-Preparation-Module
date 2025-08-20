class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        int count = 0;
        int maxi = 0;

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(hmap.containsKey(ch) && hmap.get(ch) >= count) {
                count = hmap.get(ch) + 1;
            }
            hmap.put(ch, i);
            int cnt = i - count + 1;
            maxi = Math.max(maxi, cnt);

        }
        return maxi;
    }
}