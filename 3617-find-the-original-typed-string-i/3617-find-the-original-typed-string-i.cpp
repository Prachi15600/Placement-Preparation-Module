class Solution {
public:
    int possibleStringCount(string word) {
        int n = word.size();
        int finalz =1, count =1, temp=1;

        for(int i=1; i<n; i++) {
            if(word[i] == word[i-1]) {
                count++;
                temp = count;
            }

            else {
                finalz = finalz + temp -1;
                count = 1;
                temp =1;
            }            
        }

        finalz = finalz + temp -1;
        

        return finalz;
        
    }
};