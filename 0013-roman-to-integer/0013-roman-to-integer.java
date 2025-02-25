class Solution {
    int sum = 0;
    public int romanToInt(String s) {
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='I') {
                if(i+1<s.length() && (s.charAt(i+1)=='V' || s.charAt(i+1)=='X')){
                    sum -= 1;
                }
                else sum = sum + 1;
                //System.out.println(s.charAt(i) + " " + sum);
            }
            else if(s.charAt(i)=='V') {
                sum = sum + 5;
                //System.out.println(s.charAt(i) + " " + sum);
            
            }
            else if(s.charAt(i)=='X') {
                if(i+1<s.length() && (s.charAt(i+1)=='L' || s.charAt(i+1)=='C')){
                    sum -= 10;
                }
                else sum += 10;
                //System.out.println(s.charAt(i) + " " + sum);
            
            }
            else if(s.charAt(i)=='L') {
                sum += 50;
                System.out.println(s.charAt(i) + " " + sum);
            
            }
            else if(s.charAt(i)=='C') {
                if(i+1<s.length() && (s.charAt(i+1)=='D' || s.charAt(i+1)=='M')){
                    sum -= 100;
                }
                else sum += 100;
                //System.out.println(s.charAt(i) + " " + sum);
            
            }
            else if(s.charAt(i)=='D') {
                sum += 500;
                //System.out.println(s.charAt(i) + " " + sum);
            
            }
            else if(s.charAt(i)=='M') {
                sum += 1000;
                //System.out.println(s.charAt(i) + " " + sum);
            
            }

        }
        return sum;
    }
}