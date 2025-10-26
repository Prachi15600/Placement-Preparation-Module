class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'I') {
                sum = sum + 1;                
            }
            else if(s.charAt(i) == 'V') {
                sum = sum + 5;
                if(i-1 >= 0 && s.charAt(i-1) == 'I') {
                    sum = sum - 2;
                }
            }
            else if(s.charAt(i) == 'X') {
                sum = sum + 10;
                if(i-1 >= 0 && s.charAt(i-1) == 'I') {
                    sum = sum - 2;
                }
            }
            else if(s.charAt(i) == 'L') {
                sum = sum + 50;
                if(i-1 >= 0 && s.charAt(i-1) == 'X') {
                    sum = sum - 20;
                }
            }
            else if(s.charAt(i) == 'C') {
                sum = sum + 100;
                if(i-1 >= 0 && s.charAt(i-1) == 'X') {
                    sum = sum - 20;
                }
            }
            else if(s.charAt(i) == 'D') {
                sum = sum + 500;
                if(i-1 >= 0 && s.charAt(i-1) == 'C') {
                    sum = sum - 200;
                }
            }
            else if(s.charAt(i) == 'M') {
                sum = sum + 1000;
                if(i-1 >= 0 && s.charAt(i-1) == 'C') {
                    sum = sum - 200;
                }
            }
        }
        return sum;
    }
}