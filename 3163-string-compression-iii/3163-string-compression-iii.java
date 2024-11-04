class Solution {
    public String compressedString(String word) {
        String comp = "";
        int count = 1;
        int n = word.length();
        
        for(int i = 1; i< n; i++) {
            if(word.charAt(i) == word.charAt(i-1)) {
                count++;
            }
            else {
                while(count > 9) {
                    comp += "9" + Character.toString(word.charAt(i-1));
                    count -= 9;
                    
                }
                
                comp += count + "" + word.charAt(i - 1);
                count = 1;
            }
        }
        
        while(count > 9) {
            comp += "9" + Character.toString(word.charAt(n-1));
            count -= 9;
            
        }
                
        comp += count + "" + word.charAt(n - 1);
        return comp;
    }
}