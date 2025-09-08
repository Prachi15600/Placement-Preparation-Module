class Solution {

    private boolean isValid(int num) {
        while(num>0) {
            if(num % 10 == 0) return false;
            num = num/10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        int[] res = new int[2];
        for(int i=1; i<=n; i++) {
            int a = i;
            int b = n-i;
            //System.out.println(a+"+"+ b);
            if(isValid(a) && isValid(b)) {
                res[0] = a;
                res[1] = b;
                break;
            }
        }
        return res;
    }
}