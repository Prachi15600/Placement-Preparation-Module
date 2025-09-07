class Solution {
    void ifEven(int n, int[] res) {
        for(int i=0; i<n/2; i++) {
            res[i] = -(i+1);
            System.out.println(res[i]);
        }
            

        for(int i=n/2; i<n; i++) {
            res[i] = n-i;
            System.out.println(res[i]);
        }
    }
    public int[] sumZero(int n) {
        int[] res = new int[n];

        if(n%2 == 0) {
            ifEven(n, res);
        }
        else {
            if(n>1) res[0] = 1;
            if(n>1) res[1] = -1;
            int sum = 0;
            for(int i=2; i<n-1; i++) {
                res[i] = i+1;
                sum = sum + i+1;
            }
            res[n-1] = -sum;
        }
        return res;
    }
}