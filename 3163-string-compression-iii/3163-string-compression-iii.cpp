class Solution {
public:
    string compressedString(string word) {
        string comp = "";
        int n = word.length();
        int count = 1;
        
        for(int i = 1; i < n ; i++) {
            
            
                if(word[i] == word[i-1]) {
                    count++;
                }
                else {
                    while(count > 9) {
                        comp += "9" + string(1, word[i - 1]); 
                        count = count - 9;
                    }
                    
                     comp += to_string(count) + word[i - 1];
                    count = 1;
                    
                    
                }             
        }
        
        while(count > 9) {
            comp += "9" + string(1, word[n - 1]);
            count = count - 9;
        }
                    
         comp += to_string(count) + word[n - 1];
        
        
        return comp;
    }
};