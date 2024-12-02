class Solution {
public:
    int isPrefixOfWord(string sentence, string searchWord) {
        int n = sentence.size();
        int m = searchWord.size();
        int wordIndex = 1;
        string curWord = "";
        for(int i=0; i<=n; i++) {
           if(i<n && sentence[i]!= ' ') {
               curWord += sentence[i];
           }
            
            else {
                if(curWord.substr(0, m) == searchWord) return wordIndex;
                curWord = "";
                ++wordIndex;
            }
            
        }
        
        return -1;
    }
};