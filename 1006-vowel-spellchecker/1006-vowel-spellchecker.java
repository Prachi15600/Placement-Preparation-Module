class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        int n = wordlist.length;
        int m = queries.length;
        String[] answer = new String[m];
        HashMap<String, String> hmap = new HashMap<>();
        HashMap<String, String> vowelMap = new HashMap<>();

        for(String word : wordlist) {
            hmap.putIfAbsent(word.toLowerCase(), word);
            vowelMap.putIfAbsent(deVowel(word.toLowerCase()), word);
        }

        for(int i=0; i<m; i++) {
            String query = queries[i];
            boolean foundExact = false;

            for(String w : wordlist) {
                if(query.equals(w)) {
                    answer[i] = w;
                    foundExact = true;
                    break;
                }
            }

            if(foundExact) continue;

            String lower = query.toLowerCase();
            if(hmap.containsKey(lower)) {
                answer[i] = hmap.get(lower);
            }

            else if(vowelMap.containsKey(deVowel(lower))){
                answer[i] = vowelMap.get(deVowel(lower));
                
            }
            else {
                answer[i] = "";
            }
        }
        return answer;
    }

    private String deVowel(String word) {
    StringBuilder sb = new StringBuilder();
    for(char c : word.toCharArray()) {
        if (isVowel(c)) sb.append('*');
        else sb.append(c);
    }
    return sb.toString();
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    
}

