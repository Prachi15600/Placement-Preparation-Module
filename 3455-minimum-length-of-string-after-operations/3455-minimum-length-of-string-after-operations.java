class Solution {
    public int minimumLength(String s) {
        if(s.length() < 3) return s.length();
        HashMap<Character, Integer> hm = new HashMap<>();

        for(char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c,0)+1);
        }

        int remaining = s.length();

        for(char key : hm.keySet()) {
            int value = hm.get(key);
            while(value >= 3) {
                value -= 2;
                remaining -= 2; 
            }
        }

        return remaining;
    }
}