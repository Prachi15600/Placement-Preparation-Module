class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashMap<Character, Boolean> hmap = new HashMap<>();

        for(char ch : brokenLetters.toCharArray()) {
            hmap.put(ch, true);
        }
        String words[] = text.split(" ");
        int count = 0;
        for(String word : words) {
            boolean canType = true;
            for(char ch : word.toCharArray()) {
                if(hmap.containsKey(ch)) {
                    canType = false;
                    break;
                }
            }

            if(canType) count++;
        }
        return count;
    }

}